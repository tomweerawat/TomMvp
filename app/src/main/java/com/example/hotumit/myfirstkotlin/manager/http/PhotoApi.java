package com.example.hotumit.myfirstkotlin.manager.http;



import com.example.hotumit.myfirstkotlin.dao.PhotoItemCollectionDao;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface PhotoApi {
    @POST("list")
    Call <PhotoItemCollectionDao> loadPhotoList();
}
