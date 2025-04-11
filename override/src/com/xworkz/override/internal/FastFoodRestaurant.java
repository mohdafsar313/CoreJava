package com.xworkz.override.internal;

public class FastFoodRestaurant extends Restaurant{
    public FastFoodRestaurant() {
        System.out.println("FastFoodRestaurant: Constructor is running");
    }

    @Override
    public void serveFood() {
        System.out.println("FastFoodRestaurant: Serving fast food items quickly");
    }

    public void takeDriveThruOrder() {
        System.out.println("FastFoodRestaurant: Taking drive-thru orders");
    }

    public void prepareComboMeal() {
        System.out.println("FastFoodRestaurant: Preparing a combo meal");
    }
}
