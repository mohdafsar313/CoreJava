package com.xworkz.object.internal;

import java.util.Objects;

public class Crayon {
    private String color;
    private String brand;
    private double length; // in cm
    private boolean isWaxBased;

    public Crayon() {
    }

    public void setCrayon(String color, String brand, double length, boolean isWaxBased) {
        this.color = color;
        this.brand = brand;
        this.length = length;
        this.isWaxBased = isWaxBased;
    }

    @Override
    public String toString() {
        return "Crayon{color='" + color + "', brand='" + brand + "', length=" + length + ", isWaxBased=" + isWaxBased + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Crayon) {
            Crayon crayon = (Crayon) obj;
            if (Objects.equals(this.color, crayon.color) &&
                    Objects.equals(this.brand, crayon.brand) &&
                    this.length == crayon.length &&
                    this.isWaxBased == crayon.isWaxBased) {
                System.out.println("Crayons are matching..");
                return true;
            }
        }
        return false;
    }
}
