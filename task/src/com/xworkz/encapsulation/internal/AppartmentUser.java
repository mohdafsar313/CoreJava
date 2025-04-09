package com.xworkz.encapsulation.internal;

public class AppartmentUser {
    public void test() {
        Appartment appartment = new Appartment();
        appartment.setName("Skyline Heights");
        appartment.setLocation("Whitefield");
        appartment.setNumberOfFlats(120);
        appartment.setHasLift(true);
        appartment.setMaintenanceCost(3500.0);

        System.out.println("Appartment Name: " + appartment.getName());
        System.out.println("Location: " + appartment.getLocation());
        System.out.println("Has Lift? " + appartment.isHasLift());

        appartment.openGate();
    }
}
