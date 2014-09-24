package com.example.daggerexample.ui;

import android.os.Bundle;
import android.widget.TextView;

import com.example.daggerexample.model.Bar;
import com.example.daggerexample.BaseActivity;
import com.example.daggerexample.ExampleApp;
import com.example.daggerexample.model.Foo;
import com.example.daggerexample.R;

import javax.inject.Inject;

/**
 * Created by Amaury Esparza on 18/09/2014.
 */
public class ExampleActivity extends BaseActivity {

    @Inject Foo foo;
    @Inject Bar bar;

    private TextView textFoo;
    private TextView textBar;


    @Override
    public void onCreate(Bundle savedInstanceState){
        //Call the BaseActivity's onCreate() method
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textFoo = (TextView) findViewById(R.id.textView);
        textBar = (TextView) findViewById(R.id.textView2);

        //The Foo and Bar references are already injected
        textFoo.setText(foo.getText());
        textBar.setText(bar.getText());
        foo.printValues();
        bar.printValues();
    }
}
