package com.example.hotumit.myfirstkotlin.fragment.mainlist.adapter.presenter;


import com.example.hotumit.myfirstkotlin.base.BasePresenter;
import com.example.hotumit.myfirstkotlin.dao.DessertItemCollectionDao;

/**
 * Created by nuuneoi on 12/15/2015.
 */
public interface IMainListAdapterPresenter extends BasePresenter {

    void setData(DessertItemCollectionDao dao);

}
