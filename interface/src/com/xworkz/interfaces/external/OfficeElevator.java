package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.rules.Elevator;
import sun.font.ExtendedTextLabel;

public class OfficeElevator implements Elevator {
    @Override
    public void moveUp() {
        System.out.println("Elevator is moving up");
    }

    @Override
    public void moveDown() {
        System.out.println("Elevator is moving down");
    }

    @Override
    public void openDoor() {
        System.out.println("Elevator door opened");
    }

    @Override
    public void closeDoor() {
        System.out.println("Elevator door closed");
    }

    @Override
    public void stop() {
        System.out.println("Elevator has stopped at a floor");
    }

    @Override
    public void ringAlarm() {
        System.out.println("Elevator alarm is ringing");
    }

    @Override
    public void displayFloor() {
        System.out.println("Displaying current floor");
    }

    @Override
    public void turnOnLight() {
        System.out.println("Elevator light is turned on");
    }

    @Override
    public void turnOffLight() {
        System.out.println("Elevator light is turned off");
    }
}
