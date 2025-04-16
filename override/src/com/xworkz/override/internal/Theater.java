package com.xworkz.override.internal;

public class Theater {
    private String name;
    private int cost;

    public Theater() {
        System.out.println("Theater: Constructor is running");
    }

    public void playMovie() {
        System.out.println("Theater: Playing a standard movie show");
    }
    public void setName(String name,int cost){
        this.name=name;
        this.cost=cost;
    }
    @Override
    public String toString() {
        return "theater name"+name+", cost"+cost;
    }
}
