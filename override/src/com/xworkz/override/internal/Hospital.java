package com.xworkz.override.internal;

public class Hospital {
    private String name;
    private String location;
    public Hospital(String name,String location) {
        System.out.println("Hospital: Constructor is running");
    }

    public void treatPatient() {
        System.out.println("Hospital: Providing general medical treatment");
    }
    @Override
    public String toString() {
        return "hospital name"+name+", location "+location;
    }
}
