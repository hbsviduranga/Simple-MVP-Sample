package com.example.dell.mvpsample.ui.login;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.dell.mvpsample.MvpSample;
import com.example.dell.mvpsample.R;
import com.example.dell.mvpsample.ui.base.BaseActivity;
import com.example.dell.mvpsample.ui.users.UsersActivity;

public class LoginActivity extends BaseActivity implements LoginMvpView {

    private static final String LOG_TAG = LoginActivity.class.getSimpleName();
    private EditText editTextUserName;
    private EditText editTextPassword;

    public static Intent getStartIntent(Context context) {
        return new Intent(context, LoginActivity.class);
    }

    private LoginPresenter mLoginPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Log.d(LOG_TAG, "onCreate()");

        mLoginPresenter = new LoginPresenter(((MvpSample)getApplicationContext()).getDataManager());
        mLoginPresenter.onAttach(this);

        editTextUserName = (EditText) findViewById(R.id.edtUserName);
        editTextPassword = (EditText) findViewById(R.id.edtPassword);
        Button btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onLoginButtonClicked();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LOG_TAG, "onStart()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(LOG_TAG, "onRestart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(LOG_TAG, "onResume()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LOG_TAG, "onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LOG_TAG, "onDestroy()");
    }

    @Override
    public void onLoginButtonClicked() {
        String userName = editTextUserName.getText().toString();
        String password = editTextPassword.getText().toString();

        if (userName.isEmpty()) {
            editTextUserName.setError("User name cannot be empty");
            return;
        }
        if (password.isEmpty()) {
            editTextPassword.setError("Password cannot be empty");
            return;
        }
        mLoginPresenter.proceedLogin(userName, password);
    }

    @Override
    public void openUsersActivity() {
        Intent usersActivityIntent = UsersActivity.getStartIntent(this);
        startActivity(usersActivityIntent);
        finish();
    }
}
