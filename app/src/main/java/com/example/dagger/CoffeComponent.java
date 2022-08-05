package com.example.dagger;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@ActivityScope
                //connect modules = CoffeModule.class
@Component(dependencies = AppComponent.class)//(modules = RiverModule.class)
public interface CoffeComponent {

    Coffe getCoffe();

    void Inject(MainActivity activity);

    @Component.Builder
    interface Builder{

        @BindsInstance
        Builder sugar(@sugar int sugar);

        CoffeComponent build();

        Builder appComponent (AppComponent appComponent);

        @BindsInstance
        Builder milk(@milk int milk);
    }
}
