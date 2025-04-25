package com.xworkz.jdbc.external;

import com.xworkz.jdbc.internal.Animal;

public class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("Cat says: Meow meow!");
    }
}
