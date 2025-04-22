package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.rules.Car;

import java.awt.event.ComponentAdapter;

public class ElectricCar implements Car {
    @Override
    public void start() {
        System.out.println("Electric car is starting");
    }

    @Override
    public void stop() {
        System.out.println("Electric car is stopping");
    }

    @Override
    public void accelerate() {
        System.out.println("Electric car is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Electric car is braking");
    }

    @Override
    public void honk() {
        System.out.println("Electric car is honking");
    }
}
