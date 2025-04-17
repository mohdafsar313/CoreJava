package com.xworkz.override.internal;

public class Food {
    private String name;
    private int price;
    public Food(String name ,int price) {
        System.out.println("Food: Constructor is running");
    }

    public void prepare() {
        System.out.println("Food: Preparing a generic meal");
    }
    @Override
    public String toString() {
        return "food name"+name+", price"+price;
    }
}
