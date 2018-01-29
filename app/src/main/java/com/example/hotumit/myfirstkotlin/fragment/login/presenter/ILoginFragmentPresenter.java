package com.example.hotumit.myfirstkotlin.fragment.login.presenter;


import com.example.hotumit.myfirstkotlin.base.BasePresenter;

/**
 * Created by nuuneoi on 12/15/2015.
 */
public interface ILoginFragmentPresenter extends BasePresenter {

    void clear();
    void login(String username, String password);

    String getLastUsername();

}
