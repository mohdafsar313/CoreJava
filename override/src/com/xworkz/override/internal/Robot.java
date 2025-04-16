package com.xworkz.override.internal;

public class Robot {
    private String name;
    private String type;
    public Robot() {
        System.out.println("Robot: Constructor is running");
    }

    public void performTask() {
        System.out.println("Robot: Performing a generic task");
    }
    public void setName(String name,String type){
        this.name=name;
        this.type=type;
    }
    @Override
    public String toString() {
        return "robot name"+name+", type"+type;
    }

}
