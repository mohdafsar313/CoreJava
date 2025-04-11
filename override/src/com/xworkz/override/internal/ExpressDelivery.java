package com.xworkz.override.internal;

public class ExpressDelivery extends DeliveryService{
    public ExpressDelivery() {
        System.out.println("ExpressDelivery: Constructor is running");
    }

    @Override
    public void deliverPackage() {
        System.out.println("ExpressDelivery: Delivering package with express speed");
    }

    public void trackPackage() {
        System.out.println("ExpressDelivery: Tracking package in real-time");
    }

    public void notifyCustomer() {
        System.out.println("ExpressDelivery: Notifying customer about delivery status");
    }
}
