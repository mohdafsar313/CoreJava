package com.xworkz.encapsulation.internal;

public class PostOffice {
    private String location;
    private String postmaster;
    private int numberOfEmployees;
    private boolean hasATM;
    private double areaInSqFt;

    void setLocation(String location) { this.location = location; }
    void setPostmaster(String postmaster) { this.postmaster = postmaster; }
    void setNumberOfEmployees(int numberOfEmployees) { this.numberOfEmployees = numberOfEmployees; }
    void setHasATM(boolean hasATM) { this.hasATM = hasATM; }
    void setAreaInSqFt(double areaInSqFt) { this.areaInSqFt = areaInSqFt; }

    public String getLocation() { return location; }
    public String getPostmaster() { return postmaster; }
    public int getNumberOfEmployees() { return numberOfEmployees; }
    public boolean isHasATM() { return hasATM; }
    public double getAreaInSqFt() { return areaInSqFt; }

    public void deliverMail() {
        System.out.println("Mail is being delivered from the post office at " + location + " by " + postmaster);
    }
}
