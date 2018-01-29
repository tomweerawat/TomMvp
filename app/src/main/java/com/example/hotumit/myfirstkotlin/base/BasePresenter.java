package com.example.hotumit.myfirstkotlin.base;

import android.os.Bundle;
import android.support.annotation.NonNull;

/**
 * Created by nuuneoi on 12/15/2015.
 */
public interface BasePresenter {

    void onSaveInstanceState(@NonNull Bundle outState);
    void onRestoreInstanceState(@NonNull Bundle savedInstanceState);

}
