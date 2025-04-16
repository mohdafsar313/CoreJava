package com.xworkz.override.internal;

public class University {
    private String name;
    private String location;
    public University() {
        System.out.println("University: Constructor is running");
    }

    public void conductExam() {
        System.out.println("University: Conducting university-level examinations");
    }
    public void setName(String name,String location){
        this.name=name;
        this.location=location;
    }
    @Override
    public String toString() {
        return "university name"+name+", location"+location;
    }
}
