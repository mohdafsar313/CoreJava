package com.xworkz.override.internal;

public class MarsMission extends SpaceAgency{
    public MarsMission() {
        System.out.println("MarsMission: Constructor is running");
    }

    @Override
    public void launchMission() {
        System.out.println("MarsMission: Launching mission to explore Mars");
    }

    public void collectSoilSamples() {
        System.out.println("MarsMission: Collecting Martian soil samples");
    }

    public void analyzeAtmosphere() {
        System.out.println("MarsMission: Analyzing the atmosphere of Mars");
    }
}
