package com.example.dagger;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class RiverModule {

//    int sugar;

//    public CoffeModule(int sugar) {
//        this.sugar = sugar;
//    }

    @Singleton//لان class river مش انا كاتبه يعني كلاس جاهز
    @Provides
    River provideRiver (){

        return new River();
    }

//    @Provides
//    int provideSugar (){
//
//        return sugar;
//    }
}
