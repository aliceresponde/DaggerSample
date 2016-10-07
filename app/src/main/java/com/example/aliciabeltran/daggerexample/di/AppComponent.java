package com.example.aliciabeltran.daggerexample.di;

import com.example.aliciabeltran.daggerexample.bases.BaseInteractor;
import com.example.aliciabeltran.daggerexample.bases.BasePresenter;
import com.squareup.otto.Bus;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Module;

/**
 * Created by alicia.beltran on 05/10/2016.
 */

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    void inject(BasePresenter presenter);
    void inject(BaseInteractor interactor);

    //Expose
    Bus getBus();

}
