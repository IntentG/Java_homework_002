package com.intentg;

public class Transmission implements Checkable {
    private int gearNumber;

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


}
