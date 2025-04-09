package com.xworkz.encapsulation.internal;

public class JetUser {
    public void test() {
        Jet jet = new Jet();
        jet.setModel("F-22 Raptor");
        jet.setManufacturer("Lockheed Martin");
        jet.setCapacity(1);
        jet.setIsMilitary(true);
        jet.setMaxSpeed(2410.0);

        System.out.println("Jet Model: " + jet.getModel());
        System.out.println("Manufacturer: " + jet.getManufacturer());
        System.out.println("Is Military? " + jet.isMilitary());

        jet.fly();
    }
}
