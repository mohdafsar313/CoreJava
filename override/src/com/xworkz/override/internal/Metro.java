package com.xworkz.override.internal;

public class Metro extends Transports{
    public Metro() {
        System.out.println("Metro: Constructor is running");
    }

    @Override
    public void move() {
        System.out.println("Metro: Running on electric tracks through the city");
    }

    public void openDoors() {
        System.out.println("Metro: Opening automatic doors at station");
    }

    public void announceStops() {
        System.out.println("Metro: Announcing upcoming station stops");
    }
}
