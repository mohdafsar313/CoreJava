package com.xworkz.override.internal;

public class Farm {
    private    String farmer_name;
    private String crop;

    public Farm(String farmer_name,String crop) {
        System.out.println("Farm: Constructor is running");
    }

    public void growCrops() {
        System.out.println("Farm: Growing crops using traditional methods");
    }
    @Override
    public String toString() {
        return "farmer name"+farmer_name+", crop"+crop;
    }
}
