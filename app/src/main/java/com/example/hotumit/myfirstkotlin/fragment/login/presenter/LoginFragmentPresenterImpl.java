package com.example.hotumit.myfirstkotlin.fragment.login.presenter;

import android.os.Bundle;
import android.support.annotation.NonNull;

import com.example.hotumit.myfirstkotlin.fragment.login.interactor.ILoginFragmentInteractor;
import com.example.hotumit.myfirstkotlin.fragment.login.interactor.LoginFragmentInteractorImpl;
import com.example.hotumit.myfirstkotlin.fragment.login.interactor.OnLoginFragmentInteractorListener;
import com.example.hotumit.myfirstkotlin.fragment.login.model.UserModel;
import com.example.hotumit.myfirstkotlin.fragment.login.view.ILoginFragmentView;
import com.example.hotumit.myfirstkotlin.fragment.login.view.LoginFragment;


import org.parceler.Parcels;

/**
 * Created by nuuneoi on 12/15/2015.
 */
public class LoginFragmentPresenterImpl implements ILoginFragmentPresenter, OnLoginFragmentInteractorListener {

    ILoginFragmentView loginFragmentView;
    ILoginFragmentInteractor loginFragmentInteractor;

    UserModel userModel;

    public LoginFragmentPresenterImpl(LoginFragment loginFragmentView, LoginFragmentInteractorImpl loginFragmentInteractor) {
        this.loginFragmentView = loginFragmentView;
        this.loginFragmentInteractor = loginFragmentInteractor;

        userModel = new UserModel();
    }

    @Override
    public void clear() {
        loginFragmentView.onClearText();
    }

    @Override
    public void login(String username, String password) {
        loginFragmentInteractor.login(username, password, this);
        userModel.setUsername(username);
    }

    @Override
    public String getLastUsername() {
        return userModel.getUsername();
    }

    @Override
    public void onLoginResult(boolean success) {
        loginFragmentView.onLoginResult(success);
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        outState.putParcelable("userModel", Parcels.wrap(userModel));
    }

    @Override
    public void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        userModel = Parcels.unwrap(savedInstanceState.getParcelable("userModel"));
    }

}
