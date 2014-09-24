package com.example.daggerexample;

import android.app.Activity;
import android.os.Bundle;

import com.example.daggerexample.Bar;
import com.example.daggerexample.ExampleApp;
import com.example.daggerexample.Foo;
import com.example.daggerexample.R;

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
        application = (ExampleApp) getApplication();
        application.getObjectGraph().inject(this);
        foo.printValues();
        bar.printValues();
    }
}
