package com.xworkz.override.internal;

public class Car extends Vehicle{
    public Car() {
        System.out.println("Car: Constructor is running");
    }

    @Override
    public void startEngine() {
        System.out.println("Car: Engine started with keyless ignition");
    }

    public void playMusic() {
        System.out.println("Car: Playing music");
    }

    public void openSunroof() {
        System.out.println("Car: Sunroof opened");
    }
}
