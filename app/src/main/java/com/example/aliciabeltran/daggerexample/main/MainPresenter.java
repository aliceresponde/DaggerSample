package com.example.aliciabeltran.daggerexample.main;

import com.example.aliciabeltran.daggerexample.bases.BasePresenter;
import com.example.aliciabeltran.daggerexample.main.event.MainEvent;
import com.example.aliciabeltran.daggerexample.main.view.MainActivityView;
import com.squareup.otto.Subscribe;

/**
 * Created by alicia.beltran on 04/10/2016.
 */

public class MainPresenter extends BasePresenter {
    private MainActivityView view;
    private  MainActivityInteractor interactor;




    @Subscribe
    void onEventMainThread(MainEvent event){

    }
}
