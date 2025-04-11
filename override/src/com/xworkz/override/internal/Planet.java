package com.xworkz.override.internal;

public class Planet extends Galaxy{
    public Planet() {
        System.out.println(" Planet: Constructor is running");
    }

    @Override
    public void orbit() {
        System.out.println("Planet: custom orbit around its star");
    }

    public void atmosphere() {
        System.out.println(" Planet: analyzing the atmosphere");
    }

    public void life() {
        System.out.println(" Planet: possibility of life detected");
    }
}
