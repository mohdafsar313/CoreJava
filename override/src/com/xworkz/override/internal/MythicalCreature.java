package com.xworkz.override.internal;

public class MythicalCreature {
    private String name;
    private int size;
    public MythicalCreature(String name,int size) {
        System.out.println("MythicalCreature: Constructor is running");
    }

    public void usePower() {
        System.out.println("MythicalCreature: Using ancient mythical powers");
    }
    @Override
    public String toString() {
        return "creature name"+name+", size"+size;
    }
    
}
