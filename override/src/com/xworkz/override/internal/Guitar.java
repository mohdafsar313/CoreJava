package com.xworkz.override.internal;

public class Guitar extends Instrument{
    public Guitar() {
        System.out.println("Guitar: Constructor is running");
    }

    @Override
    public void play() {
        System.out.println("Guitar: Strumming chords");
    }

    public void tuneStrings() {
        System.out.println("Guitar: Tuning the strings");
    }

    public void switchPickup() {
        System.out.println("Guitar: Switching pickups");
    }
}
