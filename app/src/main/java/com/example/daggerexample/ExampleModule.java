package com.example.daggerexample;

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

    @Provides @Singleton
    public Foo provideFoo(){
        return new Foo();
    }

    @Provides @Singleton
    public Bar provideBar(){
        return new Bar();
    }

}
