package com.xworkz.override.internal;

public class Train extends Transport{
    public Train() {
        System.out.println("Train: Constructor is running");
    }

    @Override
    public void move() {
        System.out.println("Train: Moving on railway tracks");
    }

    public void announceStation() {
        System.out.println("Train: Announcing next station");
    }

    public void checkTickets() {
        System.out.println("Train: Ticket checker verifying tickets");
    }
}
