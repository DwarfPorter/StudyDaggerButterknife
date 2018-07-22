package ru.geekbrains.sword;

import android.app.Application;

public class CalcApplication extends Application {
    private CalcComponent calcComponent;

    public CalcComponent getCalcComponent() {
        return calcComponent;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        calcComponent = createCalcComponent();
    }

    private CalcComponent createCalcComponent(){
        return DaggerCalcComponent.builder()
                .build();
    }
}
