package com.example.hotumit.myfirstkotlin.fragment.mainlist.interactor;



import com.example.hotumit.myfirstkotlin.dao.DessertItemCollectionDao;


/**
 * Created by nuuneoi on 12/15/2015.
 */
public interface IMainListFragmentInteractor {

    io.reactivex.Observable<DessertItemCollectionDao> getLoadDessertListStream();

}
