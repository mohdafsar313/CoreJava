package com.xworkz.override.internal;

public class TimeMachine {
    private String name;
    private String type;
    public TimeMachine() {
        System.out.println("TimeMachine: Constructor is running");
    }

    public void travel() {
        System.out.println("TimeMachine: Traveling through classical timeline");
    }
    public void setName(String name,String type){
        this.name=name;
        this.type=type;
    }
    @Override
    public String toString() {
        return "time machine name"+name+", type"+type;
    }
}
