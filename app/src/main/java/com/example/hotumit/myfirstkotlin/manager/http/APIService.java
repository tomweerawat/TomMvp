package com.example.hotumit.myfirstkotlin.manager.http;


import com.example.hotumit.myfirstkotlin.dao.DessertItemCollectionDao;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.POST;

/**
 * Created by nuuneoi on 10/8/2015 AD.
 */
public interface APIService {

    @POST("list")
    Call<DessertItemCollectionDao> loadDesserts();

    @POST("list")
    Observable<DessertItemCollectionDao> loadDessertsRx();

}
