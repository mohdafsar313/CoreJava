package com.xworkz.override.internal;

public class Kitchen {
    private int size;
    private String materials;
    public Kitchen(int size,String materials) {
        System.out.println("Kitchen: Constructor is running");
    }

    public void cook() {
        System.out.println("Kitchen: Cooking using basic utensils");
    }
    @Override
    public String toString() {
        return "kitchen size"+size+", materials "+materials;
    }
}
