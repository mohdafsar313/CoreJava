package com.xworkz.override.internal;

public class Pizza extends Food{
    public Pizza() {
        System.out.println("Pizza: Constructor is running");
    }

    @Override
    public void prepare() {
        System.out.println("Pizza: Preparing a cheesy pizza");
    }

    public void addToppings() {
        System.out.println("Pizza: Adding toppings");
    }

    public void bake() {
        System.out.println("Pizza: Baking the pizza in oven");
    }
}
