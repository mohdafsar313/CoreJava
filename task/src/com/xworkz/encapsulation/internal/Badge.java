package com.xworkz.encapsulation.internal;

public class Badge {
    private String title;
    private String issuedBy;
    private int level;
    private boolean isDigital;
    private double sizeInMB;

    void setTitle(String title) { this.title = title; }
    void setIssuedBy(String issuedBy) { this.issuedBy = issuedBy; }
    void setLevel(int level) { this.level = level; }
    void setIsDigital(boolean isDigital) { this.isDigital = isDigital; }
    void setSizeInMB(double sizeInMB) { this.sizeInMB = sizeInMB; }

    public String getTitle() { return title; }
    public String getIssuedBy() { return issuedBy; }
    public int getLevel() { return level; }
    public boolean isDigital() { return isDigital; }
    public double getSizeInMB() { return sizeInMB; }

    public void displayBadge() {
        System.out.println("Displaying badge: " + title + " issued by " + issuedBy);
    }
}
