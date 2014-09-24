package com.example.daggerexample;

import android.app.Activity;
import android.os.Bundle;

import java.util.Arrays;
import java.util.List;

import dagger.ObjectGraph;

/**
 * Created by Amaury Esparza on 24/09/2014.
 */
public abstract class BaseActivity extends Activity {

    private ObjectGraph objectGraph;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        //Get the Root ObjectGraph defined on ExampleApp
        ExampleApp application = (ExampleApp) getApplication();
        objectGraph = application.getObjectGraph();
        objectGraph.inject(this);
    }

}
