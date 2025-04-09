package com.xworkz.encapsulation.internal;

public class Garage {
    private String name;
    private String location;
    private int capacity;
    private boolean hasWashingService;
    private double monthlyRent;

    void setName(String name) { this.name = name; }
    void setLocation(String location) { this.location = location; }
    void setCapacity(int capacity) { this.capacity = capacity; }
    void setHasWashingService(boolean hasWashingService) { this.hasWashingService = hasWashingService; }
    void setMonthlyRent(double monthlyRent) { this.monthlyRent = monthlyRent; }

    public String getName() { return name; }
    public String getLocation() { return location; }
    public int getCapacity() { return capacity; }
    public boolean isHasWashingService() { return hasWashingService; }
    public double getMonthlyRent() { return monthlyRent; }

    public void serviceVehicle() {
        System.out.println(name + " at " + location + " is servicing a vehicle.");
    }
}
