package com.example.dagger;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Subcomponent;

@ActivityScope
                //connect modules = CoffeModule.class
@Subcomponent()//(modules = RiverModule.class)
public interface CoffeComponent {

    Coffe getCoffe();

    void Inject(MainActivity activity);

//    @Component.Builder
    @Subcomponent.Builder
    interface Builder{

        @BindsInstance
        Builder sugar(@sugar int sugar);

        CoffeComponent build();

//        Builder appComponent (AppComponent appComponent);

        @BindsInstance
        Builder milk(@milk int milk);
    }
}
