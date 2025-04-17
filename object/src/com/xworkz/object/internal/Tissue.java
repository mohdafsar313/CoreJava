package com.xworkz.object.internal;

import java.util.Objects;

public class Tissue {
    private String color;
    private int count; // number of tissues in a pack
    private String material; // e.g., cotton, paper
    private boolean isScented;

    public Tissue() {
    }

    public void setTissue(String color, int count, String material, boolean isScented) {
        this.color = color;
        this.count = count;
        this.material = material;
        this.isScented = isScented;
    }

    @Override
    public String toString() {
        return "Tissue{color='" + color + "', count=" + count + ", material='" + material + "', isScented=" + isScented + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Tissue) {
            Tissue tissue = (Tissue) obj;
            if (Objects.equals(this.color, tissue.color) &&
                    this.count == tissue.count &&
                    Objects.equals(this.material, tissue.material) &&
                    this.isScented == tissue.isScented) {
                System.out.println("Tissues are matching..");
                return true;
            }
        }
        return false;
    }
}
