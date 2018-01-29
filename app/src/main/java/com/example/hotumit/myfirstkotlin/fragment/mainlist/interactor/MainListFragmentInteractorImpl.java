package com.example.hotumit.myfirstkotlin.fragment.mainlist.interactor;


import com.example.hotumit.myfirstkotlin.dao.DessertItemCollectionDao;
import com.example.hotumit.myfirstkotlin.manager.http.HTTPManager;

/**
 * Created by nuuneoi on 12/15/2015.
 */
public class MainListFragmentInteractorImpl implements IMainListFragmentInteractor {

    @Override
    public io.reactivex.Observable<DessertItemCollectionDao> getLoadDessertListStream() {
        return HTTPManager.getInstance().getService().loadDessertsRx();
    }

}
