package com.example.dell.mvpsample.ui.splash;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.dell.mvpsample.MvpSample;
import com.example.dell.mvpsample.R;
import com.example.dell.mvpsample.data.DataManager;
import com.example.dell.mvpsample.ui.base.BaseActivity;
import com.example.dell.mvpsample.ui.base.MvpView;
import com.example.dell.mvpsample.ui.login.LoginActivity;
import com.example.dell.mvpsample.ui.users.UsersActivity;

public class SplashActivity extends BaseActivity implements SplashMvpView {

    private static final String LOG_TAG = SplashActivity.class.getSimpleName();
    private SplashPresenter mSplashMvpPresenter;
    public static Intent getStartIntent(Context context) {
        return new Intent(context, SplashActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(LOG_TAG, "onCreate()");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        DataManager dataManager = ((MvpSample)getApplicationContext()).getDataManager();
        mSplashMvpPresenter = new SplashPresenter<>(dataManager);
        mSplashMvpPresenter.onAttach(this);
        mSplashMvpPresenter.decideNextActivity();
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
    public void openLoginActivity() {
        Intent intent = LoginActivity.getStartIntent(this);
        startActivity(intent);
        finish();
    }

    @Override
    public void openUsersActivity() {
        Intent intent = UsersActivity.getStartIntent(this);
        startActivity(intent);
        finish();
    }
}
