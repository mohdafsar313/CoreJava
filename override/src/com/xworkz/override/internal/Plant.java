package com.xworkz.override.internal;

public class Plant {
    private String name;
    private String use;
    public Plant() {
        System.out.println("Plant: Constructor is running");
    }

    public void grow() {
        System.out.println("Plant: Growing with sunlight and water");
    }
    public void setName(String name,String use) {
        this.name = name;
        this.use=use;
    }

    @Override
    public String toString() {
        return "galaxy name"+name+", uses"+use;
    }
}


