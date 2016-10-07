package com.example.aliciabeltran.daggerexample.bases;

import android.app.Activity;

import com.squareup.otto.Bus;

import javax.inject.Inject;

/**
 * Created by alicia.beltran on 04/10/2016.
 */

public class BasePresenter implements IBasePresenter {
    @Inject Bus bus;

    @Override
    public void register() {
        bus.register(this);
    }

    @Override
    public void unRegister() {
        bus.unregister(this);
    }


}
