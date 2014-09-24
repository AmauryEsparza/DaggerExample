package com.example.daggerexample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import dagger.ObjectGraph;

/**
 * Created by Amaury Esparza on 23/09/2014.
 */
public class ExampleActivityTransaction extends Activity {

    ObjectGraph objectGraph;
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ExampleApp exampleApp = (ExampleApp) getApplication();
        //Intent intent = new Intent(getApplicationContext(), ExampleActivity.class);
        //startActivity(intent);
        objectGraph = exampleApp.getObjectGraph().plus(new ExampleModule());
    }
}
