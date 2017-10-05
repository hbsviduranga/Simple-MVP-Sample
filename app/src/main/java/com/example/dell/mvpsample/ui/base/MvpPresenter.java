package com.example.dell.mvpsample.ui.base;

/**
 * Created by DELL on 10/1/2017.
 */

public interface MvpPresenter<V extends MvpView> {
    public void onAttach(V mvpView);
}
