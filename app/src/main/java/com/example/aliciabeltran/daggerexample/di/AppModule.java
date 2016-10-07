package com.example.aliciabeltran.daggerexample.di;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import com.squareup.otto.Bus;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by alicia.beltran on 05/10/2016.
 */

@Module
public class AppModule {


    private final Application application;

    public AppModule(Application application) {
        this.application = application;
    }

    @Provides
    @Singleton
    Context provideApplicationContext() {
        return this.application;
    }

    @Provides
    @Singleton
    SharedPreferences provideSharedDataPreference(Context context){
        return context.getSharedPreferences("DATA",Context.MODE_PRIVATE);
    }


    @Provides
    @Singleton
    Bus provideBus(){
        return  new Bus();
    }
}
