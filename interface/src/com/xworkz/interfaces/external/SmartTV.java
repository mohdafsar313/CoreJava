package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.rules.Television;

public class SmartTV implements Television {
    @Override
    public void turnOn() {
        System.out.println("Smart TV is turning on");
    }

    @Override
    public void turnOff() {
        System.out.println("Smart TV is turning off");
    }

    @Override
    public void changeChannel() {
        System.out.println("Changing the Smart TV channel");
    }

    @Override
    public void adjustVolume() {
        System.out.println("Adjusting the Smart TV volume");
    }

    @Override
    public void displayInfo() {
        System.out.println("Displaying info on Smart TV");
    }
}
