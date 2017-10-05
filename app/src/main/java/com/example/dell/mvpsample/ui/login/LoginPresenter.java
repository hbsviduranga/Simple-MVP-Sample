package com.example.dell.mvpsample.ui.login;

import com.example.dell.mvpsample.data.DataManager;
import com.example.dell.mvpsample.ui.base.BasePresenter;

/**
 * Created by DELL on 10/2/2017.
 */

public class LoginPresenter<V extends LoginMvpView> extends BasePresenter<V> implements LoginMvpPresenter{
    public LoginPresenter(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public void proceedLogin(String userName, String password) {
        getDataManager().setUserName(userName);
        getDataManager().setUserLoggedIn(true);
        getMvpView().openUsersActivity();
    }
}
