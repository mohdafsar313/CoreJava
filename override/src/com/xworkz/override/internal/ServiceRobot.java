package com.xworkz.override.internal;

public class ServiceRobot extends Robot{
    public ServiceRobot() {
        System.out.println("ServiceRobot: Constructor is running");
    }

    @Override
    public void performTask() {
        System.out.println("ServiceRobot: Assisting humans with specific services");
    }

    public void cleanRoom() {
        System.out.println("ServiceRobot: Cleaning the assigned area");
    }

    public void deliverItems() {
        System.out.println("ServiceRobot: Delivering items to designated locations");
    }
}
