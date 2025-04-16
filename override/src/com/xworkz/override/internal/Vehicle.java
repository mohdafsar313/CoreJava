package com.xworkz.override.internal;

public class Vehicle {
    private String name;
    private  String type;
    public Vehicle() {
        System.out.println("Vehicle: Constructor is running");
    }

    public void startEngine() {
        System.out.println("Vehicle: Starting engine");
    }
    public void setName(String name,String type){
        this.name=name;
        this.type=type;
    }
    @Override
    public String toString() {
        return "vehicle name"+name+", type"+type;
    }
}
