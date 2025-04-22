package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.rules.Fan;

public class CeilingFan implements Fan {
    @Override
    public void turnOn() {
        System.out.println("Ceiling fan is now ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Ceiling fan is now OFF");
    }

    @Override
    public void rotate() {
        System.out.println("Ceiling fan is rotating");
    }
}
