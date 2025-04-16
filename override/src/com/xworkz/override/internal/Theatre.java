package com.xworkz.override.internal;

public class Theatre {
    private String name;
    private int cost;
    public Theatre() {
        System.out.println("Theatre: Constructor is running");
    }

    public void showMovie() {
        System.out.println("Theatre: Showing a movie on a single screen");
    }
    public void setName(String name,int cost){
        this.name=name;
        this.cost=cost;
    }
    @Override
    public String toString() {
        return "theatre name"+name+", cost"+cost;
    }
}
