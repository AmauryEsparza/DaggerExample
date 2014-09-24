package com.example.daggerexample;

import android.app.Application;
import android.util.Log;

import java.util.Arrays;
import java.util.List;

import dagger.ObjectGraph;

/**
 * Created by Amaury Esparza on 18/09/2014.
 */
public class ExampleApp extends Application {
    private ObjectGraph objectGraph;

    public ExampleApp(){

    }
    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("ExampleApp", "onCreate");
        //objectGraph = ObjectGraph.create(ExampleModule.class);
        objectGraph = ObjectGraph.create(getModules().toArray());
    }

    protected List<Object> getModules(){
        List<Object> lista = Arrays.<Object>asList(new ExampleModule());
        return lista;

    }

    public ObjectGraph getObjectGraph(){
        return objectGraph;
    }
}
