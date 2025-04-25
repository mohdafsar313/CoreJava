package com.xworkz.jdbc.external;

import com.xworkz.jdbc.internal.Animal;

public class AnimalTrainer {
    private Animal animal;

    public AnimalTrainer(Animal animal) {
        this.animal = animal;
    }

    public void makeSound() {
        this.animal.sound();
        if (this.animal != null) {
            System.out.println("Animal made a sound.");
        } else {
            System.out.println("No animal to train.");
        }
    }
}
