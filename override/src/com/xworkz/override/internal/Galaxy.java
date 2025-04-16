package com.xworkz.override.internal;

public class Galaxy {
    private String name;
    private int distance;
    public Galaxy(String name,int distance) {
        System.out.println(" Galaxy: Constructor is running");
    }

    public void orbit() {
        System.out.println(" Galaxy: orbiting in the vast universe");
    }
    @Override
    public String toString() {
        return "galaxy name"+name+", distance"+distance;
    }
}
