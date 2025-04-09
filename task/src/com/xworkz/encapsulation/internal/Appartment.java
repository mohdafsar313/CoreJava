package com.xworkz.encapsulation.internal;

public class Appartment {
    private String name;
    private String location;
    private int numberOfFlats;
    private boolean hasLift;
    private double maintenanceCost;

    void setName(String name) { this.name = name; }
    void setLocation(String location) { this.location = location; }
    void setNumberOfFlats(int numberOfFlats) { this.numberOfFlats = numberOfFlats; }
    void setHasLift(boolean hasLift) { this.hasLift = hasLift; }
    void setMaintenanceCost(double maintenanceCost) { this.maintenanceCost = maintenanceCost; }

    public String getName() { return name; }
    public String getLocation() { return location; }
    public int getNumberOfFlats() { return numberOfFlats; }
    public boolean isHasLift() { return hasLift; }
    public double getMaintenanceCost() { return maintenanceCost; }

    public void openGate() {
        System.out.println("Main gate of " + name + " at " + location + " is now open.");
    }
}
