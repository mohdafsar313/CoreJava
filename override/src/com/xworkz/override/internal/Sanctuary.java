package com.xworkz.override.internal;

public class Sanctuary {
    private String name;
    private String location;
    public Sanctuary() {
        System.out.println("Sanctuary: Constructor is running");
    }

    public void protectWildlife() {
        System.out.println("Sanctuary: Protecting various species of wildlife");
    }
    public void setName(String name,String location){
        this.name=name;
        this.location=location;
    }
    @Override
    public String toString() {
        return "robot name"+name+", location"+location;
    }
}
