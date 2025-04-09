package com.xworkz.encapsulation.internal;

public class Jet {
    private String model;
    private String manufacturer;
    private int capacity;
    private boolean isMilitary;
    private double maxSpeed;

    void setModel(String model) { this.model = model; }
    void setManufacturer(String manufacturer) { this.manufacturer = manufacturer; }
    void setCapacity(int capacity) { this.capacity = capacity; }
    void setIsMilitary(boolean isMilitary) { this.isMilitary = isMilitary; }
    void setMaxSpeed(double maxSpeed) { this.maxSpeed = maxSpeed; }

    public String getModel() { return model; }
    public String getManufacturer() { return manufacturer; }
    public int getCapacity() { return capacity; }
    public boolean isMilitary() { return isMilitary; }
    public double getMaxSpeed() { return maxSpeed; }

    public void fly() {
        System.out.println("Jet " + model + " by " + manufacturer + " is flying at speed " + maxSpeed + " km/h!");
    }
}
