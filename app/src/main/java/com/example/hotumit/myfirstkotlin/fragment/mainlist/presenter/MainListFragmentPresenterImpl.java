package com.example.hotumit.myfirstkotlin.fragment.mainlist.presenter;

import android.os.Bundle;
import android.support.annotation.NonNull;

import com.example.hotumit.myfirstkotlin.dao.DessertItemCollectionDao;
import com.example.hotumit.myfirstkotlin.fragment.mainlist.interactor.IMainListFragmentInteractor;
import com.example.hotumit.myfirstkotlin.fragment.mainlist.interactor.MainListFragmentInteractorImpl;
import com.example.hotumit.myfirstkotlin.fragment.mainlist.view.IMainListFragmentView;
import com.example.hotumit.myfirstkotlin.fragment.mainlist.view.MainListFragment;


import io.reactivex.android.schedulers.AndroidSchedulers;
import rx.Subscriber;
import io.reactivex.android.schedulers.AndroidSchedulers;
import rx.Subscriber;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;


/**
 * Created by nuuneoi on 12/15/2015.
 */
public class MainListFragmentPresenterImpl implements IMainListFragmentPresenter {

    IMainListFragmentView mainListFragmentView;
    IMainListFragmentInteractor mainListFragmentInteractor;

    public MainListFragmentPresenterImpl(MainListFragment mainListFragmentView, MainListFragmentInteractorImpl mainListFragmentInteractor) {
        this.mainListFragmentView = mainListFragmentView;
        this.mainListFragmentInteractor = mainListFragmentInteractor;
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {

    }

    @Override
    public void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {

    }

    @Override
    public void loadDessertList() {
        mainListFragmentInteractor.getLoadDessertListStream()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .unsubscribeOn(Schedulers.io())
                .subscribe(new io.reactivex.Observer<DessertItemCollectionDao>() {
                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }

                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(DessertItemCollectionDao dessertItemCollectionDao) {
                        mainListFragmentView.showDessertList(true, dessertItemCollectionDao);
                    }
                });
    }

}
