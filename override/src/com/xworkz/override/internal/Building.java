package com.xworkz.override.internal;

public class Building {
    private String name;
    private int floor;
    public Building(String name,int floor) {
        System.out.println("Building: Constructor is running");
    }

    public void construct() {
        System.out.println("Building: Construction in progress");
    }
    @Override
    public String toString() {
        return "building name"+name+", floor layer"+floor;
    }
}
