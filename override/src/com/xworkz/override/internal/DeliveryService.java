package com.xworkz.override.internal;

public class DeliveryService {
    private String location;
    private int distance;
    public DeliveryService(String location,int distance) {
        System.out.println("DeliveryService: Constructor is running");
    }

    public void deliverPackage() {
        System.out.println("DeliveryService: Delivering package via standard service");
    }
    @Override
    public String toString() {
        return ".location"+location+", distance"+distance;
    }
}
