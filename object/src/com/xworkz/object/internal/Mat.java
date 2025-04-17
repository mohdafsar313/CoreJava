package com.xworkz.object.internal;

import java.util.Objects;

public class Mat {
    private String material;
    private String color;
    private double length;
    private double width;

    public Mat() {
    }

    public void setMat(String material, String color, double length, double width) {
        this.material = material;
        this.color = color;
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Mat{material='" + material + "', color='" + color + "', length=" + length + ", width=" + width + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Mat) {
            Mat mat = (Mat) obj;
            if (Objects.equals(this.material, mat.material) &&
                    Objects.equals(this.color, mat.color) &&
                    this.length == mat.length &&
                    this.width == mat.width) {
                System.out.println("Mats are matching..");
                return true;
            }
        }
        return false;
    }
}
