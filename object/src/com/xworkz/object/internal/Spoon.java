package com.xworkz.object.internal;

import java.util.Objects;

public class Spoon {
    private String material;
    private String color;
    private double length;
    private boolean isDisposable;

    public Spoon(String material, String color, double length, boolean isDisposable) {
        this.material = material;
        this.color = color;
        this.length = length;
        this.isDisposable = isDisposable;
    }

    @Override
    public String toString() {
        return "Spoon{material='" + material + "', color='" + color + "', length=" + length + ", isDisposable=" + isDisposable + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Spoon) {
            Spoon spoon = (Spoon) obj;
            if( Objects.equals(this.material,spoon.material))
            {
                System.out.println("matching..");
                return true;
            }
        }
        return false;
    }
}
