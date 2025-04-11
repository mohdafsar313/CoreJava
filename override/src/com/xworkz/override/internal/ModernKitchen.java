package com.xworkz.override.internal;

public class ModernKitchen extends Kitchen{
    public ModernKitchen() {
        System.out.println("ModernKitchen: Constructor is running");
    }

    @Override
    public void cook() {
        System.out.println("ModernKitchen: Cooking with smart appliances");
    }

    public void autoClean() {
        System.out.println("ModernKitchen: Automatically cleaning the kitchen");
    }

    public void controlWithApp() {
        System.out.println("ModernKitchen: Controlling appliances via mobile app");
    }
}
