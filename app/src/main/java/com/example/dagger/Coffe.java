package com.example.dagger;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;


@ActivityScope
public class Coffe {

    private static final String TAG = "Coffe";


     River river;

    @Inject
     Farm farm;
    int sugar;
    int milk;

    @Inject
    public Coffe(River river, @sugar int sugar,@milk int milk) {
        this.river = river;
        this.sugar = sugar;
        this.milk = milk;
    }



    public String getCoffeCup() {
        return farm.getBeans() + "+" + river.getWater() + " Sugar: " + sugar+ " Milk: " + milk;
    }

    @Inject
    public void ConnectElectricity(){
        Log.d(TAG, "abdallahConnectElectricity: Connect");
    }
}
