package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.rules.Bottle;

public class WaterBottle implements Bottle
{
    @Override
    public void fill() {
        System.out.println("Filling the water bottle");
    }

    @Override
    public void pour() {
        System.out.println("Pouring water from the bottle");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the water bottle");
    }
}
