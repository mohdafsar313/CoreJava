package com.xworkz.override.internal;

public class Spacecraft {
    private String name;
    private String type;
    public Spacecraft() {
        System.out.println("Spacecraft: Constructor is running");
    }

    public void launch() {
        System.out.println("Spacecraft: Launching from Earth");
    }
    public void setName(String name,String type){
        this.name=name;
        this.type=type;
    }
    @Override
    public String toString() {
        return "spacecraft name"+name+", type"+type;
    }
}
