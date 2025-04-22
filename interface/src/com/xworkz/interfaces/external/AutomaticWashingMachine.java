package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.rules.WashingMachine;

public class AutomaticWashingMachine implements WashingMachine {
    @Override
    public void startWash() {
        System.out.println("Starting the washing machine");
    }

    @Override
    public void stopWash() {
        System.out.println("Stopping the washing machine");
    }

    @Override
    public void addDetergent() {
        System.out.println("Adding detergent to the washing machine");
    }

    @Override
    public void spin() {
        System.out.println("Washing machine is spinning");
    }

    @Override
    public void drainWater() {
        System.out.println("Draining water from the washing machine");
    }

    @Override
    public void setTimer() {
        System.out.println("Setting timer on the washing machine");
    }

    @Override
    public void pause() {
        System.out.println("Pausing the washing machine");
    }
}
