package com.example.dagger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

import dagger.android.DaggerActivity;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Inject
    Coffe coffe,coffe2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        CoffeComponent component = DaggerCoffeComponent.create();
//        CoffeComponent component = DaggerCoffeComponent
//                .builder().coffeModule(new CoffeModule(3)).build();

//        CoffeComponent component = ((MainApplication)getApplication()).getCoffeComponent();
//        component.Inject(this);

         AppComponent component = ((MainApplication)getApplication()).getAppComponent();
         CoffeComponent coffeComponent = DaggerCoffeComponent.builder().milk(4).sugar(2).appComponent(component).build();
        coffeComponent.Inject(this);


//        coffe.ConnectElectricity();

        Log.d(TAG, "abdallahonCreate: " + coffe.getCoffeCup()+ "\n farm for coffe1"+coffe.farm+"\n farm for coffe2"+coffe2.farm);
        Log.d(TAG, "abdallahonCreate: " + coffe.getCoffeCup()+ "\n farm for coffe1"+coffe.river+"\n farm for coffe2"+coffe2.river);

        Log.d(TAG, "abdallahonCreate: " + "\n coffe 1 :"+coffe + "\n coffe 2 :"+coffe2+"\n river for coffe1"+coffe.river+"\n river for coffe2"+coffe2.river);

        

    }
}