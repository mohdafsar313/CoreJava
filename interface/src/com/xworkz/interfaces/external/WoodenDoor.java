package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.rules.Door;

public class WoodenDoor implements Door {
    @Override
    public void open() {
        System.out.println("Opening the wooden door");
    }

    @Override
    public void close() {
        System.out.println("Closing the wooden door");
    }

    @Override
    public void lock() {
        System.out.println("Locking the wooden door");
    }

    @Override
    public void unlock() {
        System.out.println("Unlocking the wooden door");
    }

    @Override
    public void knock() {
        System.out.println("Knocking on the wooden door");
    }
}
