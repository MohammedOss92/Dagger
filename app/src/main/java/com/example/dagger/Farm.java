package com.example.dagger;

import javax.inject.Inject;
import javax.inject.Singleton;


public class Farm {

    @Inject
    public Farm() {
    }

    public String getBeans(){
        return "Beans";
    }
}
