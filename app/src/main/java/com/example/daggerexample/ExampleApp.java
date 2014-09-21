package com.example.daggerexample;

import android.app.Application;
import android.util.Log;

import dagger.ObjectGraph;

/**
 * Created by Amaury Esparza on 18/09/2014.
 */
public class ExampleApp extends Application {
    private ObjectGraph objectGraph;

    @Override
    public void onCreate() {
        super.onCreate();
        objectGraph = ObjectGraph.create(ExampleModule.class);
        Log.d("Example App", "onCreate()");
    }

    public ObjectGraph getObjectGraph(){
        objectGraph = ObjectGraph.create(ExampleModule.class);
        return objectGraph;
    }
}
