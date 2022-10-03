package com.intentg.Java_homework_002;

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

    @Override
    public void powerOff() {
        this.enginePowerStatus = false;
        System.out.println((char)27 + "[31;1m|(-) ПИТАНИЕ ECU ДВИГАТЕЛЯ ВЫКЛЮЧЕНО|" + (char)27 + "[0m");
    }

    @Override
    public void powerOn() {
        this.enginePowerStatus = true;
        System.out.println((char)27 + "[32;1m|(+) ПИТАНИЕ ECU ДВИГАТЕЛЯ ВКЛЮЧЕНО|" + (char)27 + "[0m");
    }


}
