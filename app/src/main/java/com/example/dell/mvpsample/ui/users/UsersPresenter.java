package com.example.dell.mvpsample.ui.users;

import com.example.dell.mvpsample.data.DataManager;
import com.example.dell.mvpsample.ui.base.BasePresenter;

/**
 * Created by DELL on 10/4/2017.
 */

public class UsersPresenter<V extends UsersMvpView> extends BasePresenter<V> implements UsersMvpPresenter{
    public UsersPresenter(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public void obtainUserName() {
        getMvpView().setUserName(getDataManager().getUserName());
    }

    @Override
    public void logoutCurrentUser() {
        getDataManager().setUserLoggedIn(false);
        getMvpView().goToSplashActivity();
    }
}
