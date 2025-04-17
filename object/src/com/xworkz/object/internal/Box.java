package com.xworkz.object.internal;

import java.util.Objects;

public class Box {
    private String color;
    private String material;
    private double length;
    private boolean isReusable;

    public Box(String color, String material, double length, boolean isReusable) {
        this.color = color;
        this.material = material;
        this.length = length;
        this.isReusable = isReusable;
    }

    @Override
    public String toString() {
        return "Box{color='" + color + "', material='" + material + "', length=" + length + ", isReusable=" + isReusable + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Box) {
            Box box = (Box) obj;
            if (Objects.equals(this.material, box.material)) {
                System.out.println(" matching..");
                return true;
            }
        }
        return false;
    }
}
