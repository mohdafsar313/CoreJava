package com.xworkz.override.internal;

public class Instrument {
    private String name;
    private String type;
    public Instrument(String name, String type) {
        System.out.println("Instrument: Constructor is running");
    }

    public void play() {
        System.out.println("Instrument: Playing a sound");
    }
    @Override
    public String toString() {
        return "instrument  name"+name+", type"+type;
    }
}
