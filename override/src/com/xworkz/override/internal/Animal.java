package com.xworkz.override.internal;

public class Animal {
    private String animal_name;
    private String colour;
    public Animal(String animal_name,String colour) {
        System.out.println("🐾 Animal: Constructor is running");
    }

    public void makeSound() {
        System.out.println("🐾 Animal: making a generic sound");
    }
    @Override
    public String toString() {
        return "animal name"+animal_name+", animal colour"+colour;
    }
}
