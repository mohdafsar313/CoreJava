package com.xworkz.override.internal;

public class Sport {
    private String name;
    private String type;
    public Sport() {
        System.out.println("Sport: Constructor is running");
    }

    public void play() {
        System.out.println("Sport: Playing a generic sport");
    }
    public void setName(String name,String type){
        this.name=name;
        this.type=type;
    }
    @Override
    public String toString() {
        return "sport name"+name+", type"+type;
    }
}
