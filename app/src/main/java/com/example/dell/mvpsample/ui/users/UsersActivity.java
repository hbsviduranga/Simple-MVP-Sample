package com.example.dell.mvpsample.ui.users;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.dell.mvpsample.MvpSample;
import com.example.dell.mvpsample.R;
import com.example.dell.mvpsample.data.DataManager;
import com.example.dell.mvpsample.ui.base.BaseActivity;
import com.example.dell.mvpsample.ui.base.MvpView;
import com.example.dell.mvpsample.ui.splash.SplashActivity;

public class UsersActivity extends BaseActivity implements UsersMvpView {

    private static final String LOG_TAG = UsersActivity.class.getSimpleName();
    private TextView textViewWelcomeMessage;
    private UsersPresenter usersPresenter;

    public static Intent getStartIntent(Context context) {
        return new Intent(context, UsersActivity.class);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(LOG_TAG, "onCreate()");
        setContentView(R.layout.activity_users);
        usersPresenter = new UsersPresenter(((MvpSample)getApplicationContext()).getDataManager());
        usersPresenter.onAttach(this);

        textViewWelcomeMessage = (TextView) findViewById(R.id.textViewWelcomeMessage);
        usersPresenter.obtainUserName();
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
    public void setUserName(String userName) {
        textViewWelcomeMessage.setText(String.format(getString(R.string.welcome_msg), userName));
    }

    @Override
    public void goToSplashActivity() {
        Intent splashActivityIntent = SplashActivity.getStartIntent(this);
        startActivity(splashActivityIntent);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        usersPresenter.logoutCurrentUser();
    }
}
