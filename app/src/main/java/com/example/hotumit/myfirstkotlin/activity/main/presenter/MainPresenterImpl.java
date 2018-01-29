package com.example.hotumit.myfirstkotlin.activity.main.presenter;

import android.os.Bundle;
import android.support.annotation.NonNull;

import com.example.hotumit.myfirstkotlin.activity.main.interactor.IMainInteractor;
import com.example.hotumit.myfirstkotlin.activity.main.interactor.OnMainInteractorListener;
import com.example.hotumit.myfirstkotlin.activity.main.view.IMainView;


/**
 * Created by nuuneoi on 12/15/2015.
 */
public class MainPresenterImpl implements IMainPresenter, OnMainInteractorListener {

    private IMainView mainView;
    private IMainInteractor mainInteractor;

    public MainPresenterImpl(IMainView mainView, IMainInteractor mainInteractor) {
        this.mainView = mainView;
        this.mainInteractor = mainInteractor;
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {

    }

    @Override
    public void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {

    }
}
