package com.xworkz.object.internal;

import java.util.Objects;

public class Plate {
    private String material;
    private String shape;
    private double diameter;
    private String color;

    public Plate(String material, String shape, double diameter, String color) {
        this.material = material;
        this.shape = shape;
        this.diameter = diameter;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Plate{material='" + material + "', shape='" + shape + "', diameter=" + diameter + ", color='" + color + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Plate) {
            Plate plate = (Plate) obj;
            if( Objects.equals(this.material,plate.material))
            {
                System.out.println(" matching..");
                return true;
            }
        }
        return false;
    }
}
