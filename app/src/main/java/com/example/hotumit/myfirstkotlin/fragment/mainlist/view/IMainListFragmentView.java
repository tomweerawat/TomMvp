package com.example.hotumit.myfirstkotlin.fragment.mainlist.view;


import com.example.hotumit.myfirstkotlin.dao.DessertItemCollectionDao;

/**
 * Created by nuuneoi on 12/15/2015.
 */
public interface IMainListFragmentView {

    void showDessertList(boolean success, DessertItemCollectionDao dao);

}
