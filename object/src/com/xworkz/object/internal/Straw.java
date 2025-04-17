package com.xworkz.object.internal;

import java.util.Objects;

public class Straw {
    private String color;
    private double length; // in cm
    private String material; // e.g., plastic, paper
    private boolean isReusable;

    public Straw() {
    }

    public void setStraw(String color, double length, String material, boolean isReusable) {
        this.color = color;
        this.length = length;
        this.material = material;
        this.isReusable = isReusable;
    }

    @Override
    public String toString() {
        return "Straw{color='" + color + "', length=" + length + "cm, material='" + material + "', isReusable=" + isReusable + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Straw) {
            Straw straw = (Straw) obj;
            if (Objects.equals(this.color, straw.color) &&
                    this.length == straw.length &&
                    Objects.equals(this.material, straw.material) &&
                    this.isReusable == straw.isReusable) {
                System.out.println("Straws are matching..");
                return true;
            }
        }
        return false;
    }
}
