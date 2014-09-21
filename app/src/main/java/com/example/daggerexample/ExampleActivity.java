package com.example.daggerexample;

import android.app.Activity;
import android.os.Bundle;

import javax.inject.Inject;

/**
 * Created by Amaury Esparza on 18/09/2014.
 */
public class ExampleActivity extends Activity {
    @Inject Foo foo;
    @Inject Bar bar;
    ExampleApp application;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        (new ExampleApp()).getObjectGraph().inject(this);
        foo.printValues();
        bar.printValues();

    }
}
