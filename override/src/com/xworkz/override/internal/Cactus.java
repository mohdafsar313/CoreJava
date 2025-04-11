package com.xworkz.override.internal;

public class Cactus extends Plant{
    public Cactus() {
        System.out.println("Cactus: Constructor is running");
    }

    @Override
    public void grow() {
        System.out.println("Cactus: Growing in dry, desert conditions");
    }

    public void storeWater() {
        System.out.println("Cactus: Storing water in thick stems");
    }

    public void protectWithSpines() {
        System.out.println("Cactus: Protecting itself with sharp spines");
    }
}
