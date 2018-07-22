package ru.geekbrains.sword;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = CalcModule.class)
interface CalcComponent {
    void inject(MainActivity mainActivity);
}
