package com.example.dell.mvpsample.ui.base;

import com.example.dell.mvpsample.data.DataManager;

/**
 * Created by DELL on 10/1/2017.
 */

public class BasePresenter<V extends MvpView> implements MvpPresenter<V>{

    private V mMvpView;
    private DataManager mDataManager;

    public BasePresenter(DataManager dataManager) {
        mDataManager = dataManager;
    }
    @Override
    public void onAttach(V mvpView) {
        mMvpView = mvpView;
    }

    public V getMvpView() {
        return mMvpView;
    }

    public DataManager getDataManager() {
        return mDataManager;
    }

}
