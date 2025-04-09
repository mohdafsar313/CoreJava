package com.xworkz.encapsulation.internal;

public class TankUser {
    public void test() {
        Tank tank = new Tank();
        tank.setModel("T-90");
        tank.setCountry("Russia");
        tank.setCrewSize(3);
        tank.setActiveService(true);
        tank.setArmorThickness(950.0);

        System.out.println("Tank Model: " + tank.getModel());
        System.out.println("Country of Origin: " + tank.getCountry());
        System.out.println("Is in Active Service? " + tank.isActiveService());

        tank.fire();
    }
}
