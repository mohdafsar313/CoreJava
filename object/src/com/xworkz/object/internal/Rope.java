package com.xworkz.object.internal;

import java.util.Objects;

public class Rope {
    private String material;
    private double length;
    private int thickness;
    private boolean isBraided;

    public Rope(String material, double length, int thickness, boolean isBraided) {
        this.material = material;
        this.length = length;
        this.thickness = thickness;
        this.isBraided = isBraided;
    }

    @Override
    public String toString() {
        return "Rope{material='" + material + "', length=" + length + ", thickness=" + thickness + ", isBraided=" + isBraided + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Rope) {
            Rope rope = (Rope) obj;
            if (Objects.equals(this.material, rope.material)) {
                System.out.println(" matching..");
                return true;
            }
        }
        return false;
    }
}
