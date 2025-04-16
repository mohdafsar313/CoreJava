package com.xworkz.override.internal;

public class Gym {
    private String name;
    private int time;
    public Gym(String name,int time) {
        System.out.println("Gym: Constructor is running");
    }

    public void workout() {
        System.out.println("Gym: General workout session in progress");
    }
    @Override
    public String toString() {
        return "gym name"+name+", timings"+time;
    }
}
