package ru.geekbrains.sword;

public class Calc implements ICalc {
    private int arg1;
    private int arg2;

    @Override
    public void setArg1(int arg) {
        arg1 = arg;
    }

    @Override
    public void setArg2(int arg) {
        arg2 = arg;
    }

    @Override
    public int calcResult() {
        return arg1 + arg2;
    }
}
