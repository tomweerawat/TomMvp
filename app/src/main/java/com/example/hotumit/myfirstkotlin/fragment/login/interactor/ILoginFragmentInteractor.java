package com.example.hotumit.myfirstkotlin.fragment.login.interactor;

/**
 * Created by nuuneoi on 12/15/2015.
 */
public interface ILoginFragmentInteractor {

    void login(String username, String password, OnLoginFragmentInteractorListener listener);

}
