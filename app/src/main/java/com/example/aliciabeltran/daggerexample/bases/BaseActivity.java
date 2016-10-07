package com.example.aliciabeltran.daggerexample.bases;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by alicia.beltran on 04/10/2016.
 */

public abstract class BaseActivity extends AppCompatActivity {

    public abstract BasePresenter getPresenter();

    @Override
    protected void onResume() {
        super.onResume();
        getPresenter().register();
    }

    @Override
    protected void onPause() {
        super.onPause();
        getPresenter().unRegister();
    }
}
