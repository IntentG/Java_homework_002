package com.intentg;

public class Transmission implements Checkable, Power {
    private int gearNumber;
    public boolean transmissionPowerStatus;

    public void switchGear (int gearNumber) {
        switchGearInternal(gearNumber);
    }

    private void switchGearInternal(int gearNumber) {
    }

    public int getGearNumber() {
        return gearNumber;
    }

    public void setGearNumber(int gearNumber) {
        this.gearNumber = gearNumber;
    }



    @Override
    public void check() {
        System.out.println((char)27 + "[34;1m|ТРАНСМИССИЯ В ПОРЯДКЕ|" + (char)27 + "[0m");
    }

    @Override
    public void powerOff() {
        this.transmissionPowerStatus = false;
        System.out.println((char)27 + "[31;1m|(-) ПИТАНИЕ ECU ТРАНСМИССИИ ВЫКЛЮЧЕНО|" + (char)27 + "[0m");
    }

    @Override
    public void powerOn() {
        this.transmissionPowerStatus = true;
        System.out.println((char)27 + "[32;1m|(+) ПИТАНИЕ ECU ТРАНСМИССИИ ВКЛЮЧЕНО|" + (char)27 + "[0m");
    }


}
