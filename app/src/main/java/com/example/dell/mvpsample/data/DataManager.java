package com.example.dell.mvpsample.data;

/**
 * Created by DELL on 10/1/2017.
 */

public class DataManager {
    private SharedPrefsHelper mSharedPrefHelper;

    public DataManager(SharedPrefsHelper sharedPrefsHelper) {
        mSharedPrefHelper = sharedPrefsHelper;
    }

    public void clear() {
        mSharedPrefHelper.clear();
    }

    public void setUserName(String userName){
        mSharedPrefHelper.putUserName(userName);
    }

    public String getUserName() {
        return mSharedPrefHelper.getUserName();
    }

    public void setUserLoggedIn(boolean userLoggedIn) {
        mSharedPrefHelper.setLoggedIn(userLoggedIn);
    }

    public boolean isUserLoggedIn() {
        return mSharedPrefHelper.isLoggedIn();
    }
}
