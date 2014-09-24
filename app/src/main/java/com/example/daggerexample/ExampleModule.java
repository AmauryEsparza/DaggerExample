package com.example.daggerexample;

import com.example.daggerexample.model.Bar;
import com.example.daggerexample.model.Foo;
import com.example.daggerexample.ui.ExampleActivity;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Amaury Esparza on 18/09/2014.
 */
@Module(
        injects = {
                ExampleActivity.class
        }
)
public class ExampleModule {

    //The dependencies that are going to be injected
    @Provides @Singleton
    public Foo provideFoo(){
        return new Foo();
    }

    @Provides @Singleton
    public Bar provideBar(){
        return new Bar();
    }

}
