package com.example.dagger;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = RiverModule.class)
public interface AppComponent {

//    River getRiver();

    CoffeComponent.Builder coffeComponentBuilder();
}
