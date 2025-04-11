package com.xworkz.override.internal;

public class CrossfitGym extends Gym {
    public CrossfitGym() {
        System.out.println("CrossfitGym: Constructor is running");
    }

    @Override
    public void workout() {
        System.out.println("CrossfitGym: High-intensity crossfit workout in progress");
    }

    public void startTimer() {
        System.out.println("CrossfitGym: Starting timer for workout session");
    }

    public void logPerformance() {
        System.out.println("CrossfitGym: Logging workout performance");
    }
}
