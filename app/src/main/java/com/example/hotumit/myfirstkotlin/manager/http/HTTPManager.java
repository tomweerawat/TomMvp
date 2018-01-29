package com.example.hotumit.myfirstkotlin.manager.http;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * Created by nuuneoi on 11/16/2014.
 */
public class HTTPManager {

    private static HTTPManager instance;

    public static HTTPManager getInstance() {
        if (instance == null)
            instance = new HTTPManager();
        return instance;
    }

    private APIService mService;

    private HTTPManager() {
        Gson gson = new GsonBuilder()
                .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://nuuneoi.com/courses/dessert_maker/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();

        mService = retrofit.create(APIService.class);
    }

    public APIService getService() {
        return mService;
    }

}
