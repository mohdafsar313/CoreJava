package com.xworkz.encapsulation.internal;

public class GarageUser {
    public void test() {
        Garage garage = new Garage();
        garage.setName("SpeedFix Garage");
        garage.setLocation("Koramangala");
        garage.setCapacity(15);
        garage.setHasWashingService(true);
        garage.setMonthlyRent(25000.0);

        System.out.println("Garage Name: " + garage.getName());
        System.out.println("Location: " + garage.getLocation());
        System.out.println("Washing Service? " + garage.isHasWashingService());

        garage.serviceVehicle();
    }
}
