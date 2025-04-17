package com.xworkz.object.internal;

import java.util.Objects;

public class Comb {
    private String material;
    private int teethCount;
    private double length;
    private boolean isPlastic;

    public Comb(String material, int teethCount, double length, boolean isPlastic) {
        this.material = material;
        this.teethCount = teethCount;
        this.length = length;
        this.isPlastic = isPlastic;
    }

    @Override
    public String toString() {
        return "Comb{material='" + material + "', teethCount=" + teethCount + ", length=" + length + ", isPlastic=" + isPlastic + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Comb) {
            Comb comb = (Comb) obj;
            if (Objects.equals(this.material, comb.material)) {
                System.out.println(" matching..");
                return true;
            }
        }
        return false;
    }
}
