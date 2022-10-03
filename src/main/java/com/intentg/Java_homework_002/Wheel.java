package com.intentg.Java_homework_002;

public class Wheel implements Checkable {

    public void rotate() {
        System.out.println("Колеса вращаются");
    }


    @Override
    public void check() {
        System.out.println((char)27 + "[34;1m|КОЛЕСА В ПОРЯДКЕ|" + (char)27 + "[0m");
    }

}

