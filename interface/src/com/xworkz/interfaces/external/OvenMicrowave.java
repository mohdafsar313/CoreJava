package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.rules.Microwave;

public class OvenMicrowave implements Microwave {
    @Override
    public void start() {
        System.out.println("Microwave is starting");
    }

    @Override
    public void stop() {
        System.out.println("Microwave is stopping");
    }

    @Override
    public void heat() {
        System.out.println("Microwave is heating");
    }

    @Override
    public void defrost() {
        System.out.println("Microwave is defrosting");
    }

    @Override
    public void setTimer() {
        System.out.println("Microwave timer is set");
    }

    @Override
    public void openDoor() {
        System.out.println("Microwave door is opened");
    }

    @Override
    public void closeDoor() {
        System.out.println("Microwave door is closed");
    }
}
