package com.intentg;
import java.util.*;

public class Base {
    private Engine engine;
    private Wheel wheel1;
    private Wheel wheel2;
    private Wheel wheel3;
    private Wheel wheel4;
    private Transmission transmission;
    private Door door1;
    private Door door2;
    private Door door3;
    private Door door4;
    private AirCondition airCondition;
    private List<Checkable> checkables;


    public Base() {
        engine = new GasolineEngine();
        wheel1 = new Wheel();
        wheel2 = new Wheel();
        wheel3 = new Wheel();
        wheel4 = new Wheel();
        transmission = new Transmission();
        door1 = new Door();
        door2 = new Door();
        door3 = new Door();
        door4 = new Door();
        airCondition = new AirCondition();
        checkables = List.of(engine,wheel1,wheel2,wheel3,wheel4,transmission,door1,door2,door3,door4,airCondition);
    }

    public static void main(String[] args) {
        Car car = new Car("Ferrari", "F330");
        car.unlockAllDoors();
        car.getInCar("Федя", 1);
        car.start();
        car.turnOnAirConditioning();
        car.drive();
        car.trothleAccelerate();
        car.turnOffAirConditioning();
        car.stop();
        car.getOutCar("Федя", 1);
        car.lockAllDoors();

    }

  public void start() {
      System.out.println((char)27 + "[34;1m|ПРОВЕРКА СИСТЕМ АВТОМОБИЛЯ|" + (char)27 + "[0m");
        this.checkAll();
        this.engine.start();

    }

    public void drive() {
        if (engine.getWork()) {
            transmission.switchGear(1);
            wheel1.rotate();
            wheel2.rotate();
            wheel3.rotate();
            wheel4.rotate();
        }
    }

    public void trothleAccelerate() {
        this.engine.accelerate(25);

    }

    public void stop() {
        this.transmission.switchGear(0);
        this.engine.stop();
    }


    public boolean isEngineRunning() {
        return engine.getWork();
    }
    public void openDoor(int doorNumber) {
        switch (doorNumber) {
            case 1:
               if (door1.isLocked()) {
                    System.out.println("Дверь заблокированна. Для открытия, используйте функцию разблокировки");
                }
                else {
                    door1.open();
                }
                break;
            case 2:
                if (door2.isLocked()) {
                    System.out.println("Дверь заблокированна. Для открытия, используйте функцию разблокировки");
                }
                else {
                    door2.open();
                }
                break;
            case 3:
                if (door3.isLocked()) {
                    System.out.println("Дверь заблокированна. Для открытия, используйте функцию разблокировки");
                }
                else {
                    door3.open();
                }
                break;
            case 4:
                if (door4.isLocked()) {
                    System.out.println("Дверь заблокированна. Для открытия, используйте функцию разблокировки");
                }
                else {
                    door4.open();
                }
                break;
            default:
                System.out.println("Неверный номер двери!");
        }
    }

    public void closeDoor(int doorNumber) {
        switch (doorNumber) {
            case 1:
                System.out.println("Водительская дверь");
                door1.close();
                break;
            case 2:
                System.out.println("Пассажирская дверь");
                door2.close();
                break;
            case 3:
                System.out.println("Задняя левая пассажирская дверь");
                door3.close();
                break;
            case 4:
                System.out.println("Задняя правая пассажирская дверь");
                door4.close();
                break;
            default:
                System.out.println("Неверный номер двери!");
        }
    }

    public void lockDoor(int doorNumber) {
        switch (doorNumber) {
            case 1:
                System.out.println("Водительская дверь");
                door1.lock();
                break;
            case 2:
                System.out.println("Пассажирская дверь");
                door2.lock();
                break;
            case 3:
                System.out.println("Задняя левая пассажирская дверь");
                door3.lock();
                break;
            case 4:
                System.out.println("Задняя правая пассажирская дверь");
                door4.lock();
                break;
            default:
                System.out.println("Неверный номер двери!");
        }
    }

    public void lockAllDoors() {
        System.out.println((char)27 + "[33;1m|БЛОКИРОВКА ДВЕРЕЙ|" + (char)27 + "[0m");
        this.lockDoor(1);
        this.lockDoor(2);
        this.lockDoor(3);
        this.lockDoor(4);
    }

    public void unlockDoor(int doorNumber) {
        switch (doorNumber) {
            case 1:
                System.out.println("Водительская дверь");
                door1.unlock();
                break;
            case 2:
                System.out.println("Пассажирская дверь");
                door2.unlock();
                break;
            case 3:
                System.out.println("Задняя левая пассажирская дверь");
                door3.unlock();
                break;
            case 4:
                System.out.println("Задняя правая пассажирская дверь");
                door4.unlock();
                break;
            default:
                System.out.println("Неверный номер двери!");
        }
    }
    public void turnOnAirConditioning() {
        if (!this.isEngineRunning()) {
            System.out.println("Невозможно запустить кондиционер. Двигатель не запущен!");
        }
        else {
            this.airCondition.turnOn();
            System.out.println("Кондиционер включен");
        }
    }

    public void turnOffAirConditioning() {
        if (!this.isEngineRunning()) {
            System.out.println("Кондиционер не был включен!");
        }
        else {
            this.airCondition.turnOff();
            System.out.println("Кондиционер выключен");
        }
    }

    public void unlockAllDoors() {
        System.out.println((char)27 + "[33;1m|РАЗБЛОКИРОВКА ДВЕРЕЙ|" + (char)27 + "[0m");
        this.unlockDoor(1);
        this.unlockDoor(2);
        this.unlockDoor(3);
        this.unlockDoor(4);
    }


    public void checkAll() {
        ListIterator<Checkable> it = checkables.listIterator();
        Checkable checkable;
        while(it.hasNext()) {
            checkable = it.next();
            checkable.check();
        }
    }


}
