package com.xworkz.override.internal;

public class Skyscraper extends Building{
    public Skyscraper() {
        System.out.println("Skyscraper: Constructor is running");
    }

    @Override
    public void construct() {
        System.out.println("Skyscraper: Constructing a high-rise tower");
    }

    public void installElevator() {
        System.out.println("Skyscraper: Installing high-speed elevators");
    }

    public void addObservationDeck() {
        System.out.println("Skyscraper: Adding observation deck at the top");
    }
}
