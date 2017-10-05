package com.example.dell.mvpsample.data;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by DELL on 10/1/2017.
 */

public class SharedPrefsHelper {
    private static final String PREF_KEY = "MY_PREFERENCE";
    private static final String USER_NAME_KEY = "user name";
    private static final String LOGIN_MODE_KEY = "login mode";

    private SharedPreferences mSharedPreferences;

    public SharedPrefsHelper(Context context) {
        mSharedPreferences = context.getSharedPreferences(PREF_KEY, Context.MODE_PRIVATE);
    }

    public void clear() {
        mSharedPreferences.edit().clear().apply();
    }

    public void putUserName(String userName) {
        mSharedPreferences.edit().putString(USER_NAME_KEY, userName).apply();
    }

    public String getUserName() {
        return mSharedPreferences.getString(USER_NAME_KEY, null);
    }

    public void setLoggedIn(boolean loggedIn) {
        mSharedPreferences.edit().putBoolean(LOGIN_MODE_KEY, loggedIn).apply();
    }

    public boolean isLoggedIn() {
        return mSharedPreferences.getBoolean(LOGIN_MODE_KEY, false);
    }
}
