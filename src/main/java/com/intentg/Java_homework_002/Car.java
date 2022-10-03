package com.intentg.Java_homework_002;

public class Car extends Base {

    private final String modelName;
    private final String brand;

    public Car(String brand, String modelName) {
        this.brand = brand;
        this.modelName = modelName;
    }

    public String getModelName() {
        return modelName;
    }

    public String getBrand() {
        return brand;
    }

    public void getInCar(String person, int doorNumber) {
        String message = String.format("%s в автомобиле %n", person);
        this.openDoor(doorNumber);
        System.out.printf(message);
        this.closeDoor(doorNumber);
    }

    public void getOutCar(String person, int doorNumber) {
        String message = String.format("%s покинул автомобиль %n", person);
        this.openDoor(doorNumber);
        System.out.printf(message);
        this.closeDoor(doorNumber);
    }



}
