package com.xworkz.override.internal;

public class Restaurant {
    private String name;
    private String location;
    public Restaurant() {
        System.out.println("Restaurant: Constructor is running");
    }

    public void serveFood() {
        System.out.println("Restaurant: Serving a variety of cuisines");
    }
    public void setName(String name,String location){
        this.name=name;
        this.location=location;
    }
    @Override
    public String toString() {
        return "retaurent name"+name+", location"+location;
    }
}

