package com.xworkz.jdbc.external;

import com.xworkz.jdbc.internal.Animal;

public class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Dog says: Woof woof!");
    }
}
