package com.xworkz.object.internal;

import java.util.Objects;

public class Lid {
    private String shape;
    private String material;
    private double diameter;
    private boolean isTransparent;

    public Lid() {
    }

    public void setLid(String shape, String material, double diameter, boolean isTransparent) {
        this.shape = shape;
        this.material = material;
        this.diameter = diameter;
        this.isTransparent = isTransparent;
    }

    @Override
    public String toString() {
        return "Lid{shape='" + shape + "', material='" + material + "', diameter=" + diameter + ", isTransparent=" + isTransparent + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Lid) {
            Lid lid = (Lid) obj;
            if (Objects.equals(this.shape, lid.shape) &&
                    Objects.equals(this.material, lid.material) &&
                    this.diameter == lid.diameter &&
                    this.isTransparent == lid.isTransparent) {
                System.out.println("Lids are matching..");
                return true;
            }
        }
        return false;
    }
}
