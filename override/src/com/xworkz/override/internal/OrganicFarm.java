package com.xworkz.override.internal;

public class OrganicFarm extends Farm{
    public OrganicFarm() {
        System.out.println("OrganicFarm: Constructor is running");
    }

    @Override
    public void growCrops() {
        System.out.println("OrganicFarm: Growing crops without chemicals");
    }

    public void compost() {
        System.out.println("OrganicFarm: Making organic compost");
    }

    public void waterWithDrip() {
        System.out.println("OrganicFarm: Using drip irrigation system");
    }
}
