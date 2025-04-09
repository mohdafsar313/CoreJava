package com.xworkz.encapsulation.internal;

public class Occupation {
    private String title;
    private String industry;
    private int experienceYears;
    private boolean isRemote;
    private double averageSalary;

    void setTitle(String title) { this.title = title; }
    void setIndustry(String industry) { this.industry = industry; }
    void setExperienceYears(int experienceYears) { this.experienceYears = experienceYears; }
    void setIsRemote(boolean isRemote) { this.isRemote = isRemote; }
    void setAverageSalary(double averageSalary) { this.averageSalary = averageSalary; }

    public String getTitle() { return title; }
    public String getIndustry() { return industry; }
    public int getExperienceYears() { return experienceYears; }
    public boolean isRemote() { return isRemote; }
    public double getAverageSalary() { return averageSalary; }

    public void work() {
        System.out.println(title + " in " + industry + " is working. Remote? " + isRemote);
    }
}
