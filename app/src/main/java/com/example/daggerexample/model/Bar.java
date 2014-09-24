package com.example.daggerexample.model;

import android.util.Log;

/**
 * Created by Amaury Esparza on 18/09/2014.
 */
public class Bar {
    public void printValues(){
        Log.d("Bar Class", "Called");
    }

    public String getText(){
        return "Bar Injected";
    }
}
