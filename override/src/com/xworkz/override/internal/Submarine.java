package com.xworkz.override.internal;

public class Submarine {
    private String name;
    private String type;
    public Submarine() {
        System.out.println("Submarine: Constructor is running");
    }

    public void dive() {
        System.out.println("Submarine: Diving into the ocean");
    }
    public void setName(String name,String type){
        this.name=name;
        this.type=type;
    }
    @Override
    public String toString() {
        return "submarine name"+name+", type"+type;
    }
}
