package com.xworkz.override.internal;

public class Multiplex extends Theatre{
    public Multiplex() {
        System.out.println("Multiplex: Constructor is running");
    }

    @Override
    public void showMovie() {
        System.out.println("Multiplex: Showing multiple movies across different screens");
    }

    public void offerSnacks() {
        System.out.println("Multiplex: Offering snacks and beverages");
    }

    public void reserveSeats() {
        System.out.println("Multiplex: Reserving seats through online booking");
    }
}
