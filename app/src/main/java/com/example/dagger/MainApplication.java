package com.example.dagger;

import android.app.Application;

public class MainApplication extends Application {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

//        coffeComponent = DaggerCoffeComponent.builder().sugar(4).milk(5).build();
        appComponent = DaggerAppComponent.create();


    }

//    public CoffeComponent getCoffeComponent() {
//        return coffeComponent;
//    }


    public AppComponent getAppComponent() {
        return appComponent;
    }
}
