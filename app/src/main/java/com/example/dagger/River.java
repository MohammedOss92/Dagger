package com.example.dagger;

import android.util.Log;

import javax.inject.Inject;

public class River {

    private static final String TAG = "River";


    public River() {
        Log.d(TAG, "abdallahRiver: ");
    }

    public String getWater(){
        return "Water";
    }


}
