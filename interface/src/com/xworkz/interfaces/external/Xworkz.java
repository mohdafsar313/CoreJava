package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.rules.Internship;

public class Xworkz implements Internship {
    @Override
    public void teach() {
        System.out.println("running teach in xworkz");

    }

    @Override
    public void learn() {
        System.out.println("running learn in xworkz");

    }

    @Override
    public void attend() {
        System.out.println("running attend in xworkz");

    }
}
