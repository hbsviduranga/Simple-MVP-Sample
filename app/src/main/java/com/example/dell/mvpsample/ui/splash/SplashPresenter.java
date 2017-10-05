package com.example.dell.mvpsample.ui.splash;

import com.example.dell.mvpsample.data.DataManager;
import com.example.dell.mvpsample.ui.base.BasePresenter;

/**
 * Created by DELL on 10/1/2017.
 */

public class SplashPresenter<V extends SplashMvpView> extends BasePresenter<V> implements SplashMvpPresenter {
    SplashPresenter(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public void decideNextActivity() {
        if (getDataManager().isUserLoggedIn()) {
            getMvpView().openUsersActivity();
        } else {
            getMvpView().openLoginActivity();
        }
    }
}
