package com.intentg;

public class AirCondition implements Checkable {

    private boolean airConditionStatus;
    private boolean airConditionPowerStatus;

    public void turnOn() {
        this.airConditionStatus = true;
    }

    public void turnOff() {
        this.airConditionStatus = false;
    }


    @Override
    public void check() {
        System.out.println((char)27 + "[34;1m|КОНДИЦИОНЕР В ПОРЯДКЕ|" + (char)27 + "[0m");
    }


}
