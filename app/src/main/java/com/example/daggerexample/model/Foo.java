package com.example.daggerexample.model;

import android.util.Log;

/**
 * Created by Amaury Esparza on 18/09/2014.
 */
public class Foo {
    public void printValues(){
        Log.d("Foo Class", "Called");
    }

    public String getText(){
        return "Foo Injected";
    }
}
