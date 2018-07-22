package ru.geekbrains.sword;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class CalcModule {

    @Singleton
    @Provides
    static ICalc provideCalc(){
        return new Calc();
    }

}
