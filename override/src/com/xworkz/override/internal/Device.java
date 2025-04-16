package com.xworkz.override.internal;

public class Device {
    private String name;
    private int price;
    public Device(String name,int price) {
        System.out.println("Device: Constructor is running");
    }

    public void powerOn() {
        System.out.println("Device: Powering on");
    }
    @Override
    public String toString() {
        return "device name"+name+", price"+price;
    }
}
