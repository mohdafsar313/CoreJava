package com.xworkz.object.internal;

import java.util.Objects;

public class Brush {
    private String material;
    private int bristleCount;
    private double length;
    private boolean isElectric;

    public Brush(String material, int bristleCount, double length, boolean isElectric) {
        this.material = material;
        this.bristleCount = bristleCount;
        this.length = length;
        this.isElectric = isElectric;
    }

    @Override
    public String toString() {
        return "Brush{material='" + material + "', bristleCount=" + bristleCount + ", length=" + length + ", isElectric=" + isElectric + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Brush) {
            Brush brush = (Brush) obj;
            if (Objects.equals(this.material, brush.material)) {
                System.out.println(" matching..");
                return true;
            }
        }
        return false;
    }
}
