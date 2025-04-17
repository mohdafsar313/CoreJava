package com.xworkz.object.internal;

import java.util.Objects;

public class Eraser {
    private String brand;
    private String color;
    private String shape;
    private boolean isDustFree;

    public Eraser(String brand, String color, String shape, boolean isDustFree) {
        this.brand = brand;
        this.color = color;
        this.shape = shape;
        this.isDustFree = isDustFree;
    }

    @Override
    public String toString() {
        return "Eraser{brand='" + brand + "', color='" + color + "', shape='" + shape + "', isDustFree=" + isDustFree + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Eraser) {
            Eraser eraser = (Eraser) obj;
            if (Objects.equals(this.brand, eraser.brand)) {
                System.out.println(" matching..");
                return true;
            }
        }
        return false;
    }
}
