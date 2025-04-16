package com.xworkz.override.internal;

public class School {
    private String name;
    private  String location;
    public School() {
        System.out.println("School: Constructor is running");
    }

    public void conductClass() {
        System.out.println("School: Conducting general classes");
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
