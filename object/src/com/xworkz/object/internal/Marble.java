package com.xworkz.object.internal;

import java.util.Objects;

public class Marble {
    private String color;
    private String material;
    private double diameter;
    private boolean isTransparent;

    public Marble(String color, String material, double diameter, boolean isTransparent) {
        this.color = color;
        this.material = material;
        this.diameter = diameter;
        this.isTransparent = isTransparent;
    }

    @Override
    public String toString() {
        return "Marble{color='" + color + "', material='" + material + "', diameter=" + diameter + ", isTransparent=" + isTransparent + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Marble) {
            Marble marble = (Marble) obj;
            if (Objects.equals(this.material, marble.material)) {
                System.out.println(" matching..");
                return true;
            }
        }
        return false;
    }
}
