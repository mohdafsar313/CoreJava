package com.xworkz.override.internal;

public class Transports {
    private String name;
    private String mod_of_transports;
    public Transports() {
        System.out.println("Transport: Constructor is running");
    }

    public void move() {
        System.out.println("Transport: Moving from one place to another");
    }
    public void setName(String name,String mod_of_transports){
        this.name=name;
        this.mod_of_transports=mod_of_transports;
    }
    @Override
    public String toString() {
        return "transportation name"+name+", mod of transport"+mod_of_transports;
    }

}
