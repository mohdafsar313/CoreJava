package com.xworkz.override.internal;

public class SpaceAgency {
    private String name;
    private  String type;
    public SpaceAgency() {
        System.out.println("SpaceAgency: Constructor is running");
    }

    public void launchMission() {
        System.out.println("SpaceAgency: Launching a general space mission");
    }
    public void setName(String name,String type){
        this.name=name;
        this.type=type;
    }
    @Override
    public String toString() {
        return "spaceagency name"+name+", type"+type;
    }
}
