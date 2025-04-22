package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.rules.Refrigerator;

public class DoubleDoorRefrigerator implements Refrigerator {
    @Override
    public void turnOn() {
        System.out.println("Double door refrigerator is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Double door refrigerator is turned off");
    }

    @Override
    public void defrost() {
        System.out.println("Defrosting the refrigerator");
    }

    @Override
    public void openDoor() {
        System.out.println("Opening refrigerator door");
    }

    @Override
    public void closeDoor() {
        System.out.println("Closing refrigerator door");
    }

    @Override
    public void checkPower() {
        System.out.println("Checking refrigerator power status");
    }

    @Override
    public void coolDown() {
        System.out.println("Cooling down the refrigerator");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the refrigerator");
    }

    @Override
    public void adjustSettings() {
        System.out.println("Adjusting refrigerator settings");
    }
}
