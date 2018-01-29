package com.example.hotumit.myfirstkotlin.activity.mainlist.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;


import com.example.hotumit.myfirstkotlin.R;
import com.example.hotumit.myfirstkotlin.activity.mainlist.presenter.IMainListPresenter;
import com.example.hotumit.myfirstkotlin.activity.mainlist.presenter.MainListPresenterImpl;
import com.example.hotumit.myfirstkotlin.fragment.mainlist.view.MainListFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainListActivity extends AppCompatActivity implements IMainListView {

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    IMainListPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_list);

        presenter = new MainListPresenterImpl(this);

        initInstances();

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.contentContainer, MainListFragment.newInstance())
                    .commit();
        }
    }

    private void initInstances() {
        ButterKnife.bind(this);

        setSupportActionBar(toolbar);

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
