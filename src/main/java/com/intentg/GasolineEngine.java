package com.intentg;

public class GasolineEngine extends Engine {
    @Override
    protected void startInternal() {
        System.out.println("БЕНЗИНОВЫЙ ДВИГАТЕЛЬ ЗАПУЩЕН");
    }

    @Override
    protected void stopInternal() {
        System.out.println("БЕНЗИНОВЫЙ ДВИГАТЕЛЬ ОСТАНОВЛЕН");
    }

    @Override
    protected void accelerateInternal(int level) {
    }


    @Override
    public void check() {
        System.out.println((char)27 + "[34;1m|ДВИГАТЕЛЬ В ПОРЯДКЕ|" + (char)27 + "[0m");
    }
}
