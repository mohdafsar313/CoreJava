package com.xworkz.override.internal;

public class Studio {
    private String name;
    private String location;
    public Studio() {
        System.out.println("Studio: Constructor is running");
    }

    public void produce() {
        System.out.println("Studio: Producing general audio content");
    }
    public void setName(String name,String location){
        this.name=name;
        this.location=location;
    }
    @Override
    public String toString() {
        return "studio name"+name+", location"+location;
    }

}
