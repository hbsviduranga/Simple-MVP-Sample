package com.example.dell.mvpsample;

import android.app.Application;

import com.example.dell.mvpsample.data.DataManager;
import com.example.dell.mvpsample.data.SharedPrefsHelper;

/**
 * Created by DELL on 10/1/2017.
 */

public class MvpSample extends Application {
    private DataManager mDataManager;

    @Override
    public void onCreate() {
        super.onCreate();

        SharedPrefsHelper sharedPrefsHelper = new SharedPrefsHelper(getApplicationContext());
        mDataManager = new DataManager(sharedPrefsHelper);
    }

    public DataManager getDataManager() {
        return mDataManager;
    }
}
