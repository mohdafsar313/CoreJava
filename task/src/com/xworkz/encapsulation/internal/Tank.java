package com.xworkz.encapsulation.internal;

public class Tank {
    private String model;
    private String country;
    private int crewSize;
    private boolean activeService;
    private double armorThickness;

    void setModel(String model) { this.model = model; }
    void setCountry(String country) { this.country = country; }
    void setCrewSize(int crewSize) { this.crewSize = crewSize; }
    void setActiveService(boolean activeService) { this.activeService = activeService; }
    void setArmorThickness(double armorThickness) { this.armorThickness = armorThickness; }

    public String getModel() { return model; }
    public String getCountry() { return country; }
    public int getCrewSize() { return crewSize; }
    public boolean isActiveService() { return activeService; }
    public double getArmorThickness() { return armorThickness; }

    public void fire() {
        System.out.println(model + " from " + country + " fires a shell!");
    }
}
