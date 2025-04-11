package com.xworkz.override.internal;

public class MarsRover extends Spacecraft{
    public MarsRover() {
        System.out.println("MarsRover: Constructor is running");
    }

    @Override
    public void launch() {
        System.out.println("MarsRover: Initiating interplanetary mission to Mars");
    }

    public void collectSoilSample() {
        System.out.println("MarsRover: Collecting soil samples for analysis");
    }

    public void sendDataToEarth() {
        System.out.println("MarsRover: Sending scientific data back to Earth");
    }
}
