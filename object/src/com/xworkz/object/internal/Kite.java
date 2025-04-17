package com.xworkz.object.internal;

import java.util.Objects;

public class Kite {
    private String color;
    private double size;
    private String material;
    private boolean isFlyable;

    public Kite(String color, double size, String material, boolean isFlyable) {
        this.color = color;
        this.size = size;
        this.material = material;
        this.isFlyable = isFlyable;
    }

    @Override
    public String toString() {
        return "Kite{color='" + color + "', size=" + size + ", material='" + material + "', isFlyable=" + isFlyable + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Kite) {
            Kite kite = (Kite) obj;
            if (Objects.equals(this.material, kite.material)) {
                System.out.println(" matching..");
                return true;
            }
        }
        return false;
    }
}
