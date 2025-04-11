package com.xworkz.override.internal;

public class Dog extends Animal{
    public Dog() {
        System.out.println("Dog: Constructor is running");
    }

    @Override
    public void makeSound() {
        System.out.println(" Dog: barking - Woof! Woof!");
    }

    public void wagTail() {
        System.out.println(" Dog: wagging tail happily");
    }

    public void fetch() {
        System.out.println(" Dog: fetching the ball");
    }
}
