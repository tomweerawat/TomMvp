package com.example.hotumit.myfirstkotlin;

import android.app.Application;
import android.content.Context;

import com.example.hotumit.myfirstkotlin.manager.Contextor;

import io.reactivex.Scheduler;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by HOTUM IT on 23/1/2561.
 */

public class MainApplication extends Application {

    private Scheduler scheduler;

    @Override
    public void onCreate() {
        super.onCreate();
        Contextor.getInstance().init(getApplicationContext());
        initfont();
    }




/*
    private static MainApplication get(Context context) {
        return (MainApplication) context.getApplicationContext();
    }

    public static MainApplication create(Context context) {
        return MainApplication.get(context);
    }
*/



    private void initfont() {
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/printclearly.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build());
    }


}
