package com.example.hotumit.myfirstkotlin.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.example.hotumit.myfirstkotlin.MapsActivity;
import com.example.hotumit.myfirstkotlin.R;
import com.example.hotumit.myfirstkotlin.activity.main.view.MainActivity;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

/**
 * Created by HOTUM IT on 23/1/2561.
 */

public class SplashScreenActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        final TextView imageView = (TextView) findViewById(R.id.animtext);
        final Animation animation = AnimationUtils.loadAnimation(getBaseContext(),R.anim.slidein);
        final Animation animation1 = AnimationUtils.loadAnimation(getBaseContext(),R.anim.abc_fade_in);

        imageView.startAnimation(animation);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation1) {
                imageView.startAnimation(animation1);
                finish();
                Intent i = new Intent(getBaseContext(), MainActivity.class);
                startActivity(i);

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
}