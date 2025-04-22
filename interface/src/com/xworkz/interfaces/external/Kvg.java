package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.rules.School;

public class Kvg implements School {
    @Override
    public void teach() {
        System.out.println("running teach in kvg");

    }

    @Override
    public void learn() {
        System.out.println("running learn in kvg");

    }

    @Override
    public void play() {
        System.out.println("running play in kvg");

    }
}
