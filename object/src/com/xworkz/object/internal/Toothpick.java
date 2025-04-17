package com.xworkz.object.internal;

import java.util.Objects;

public class Toothpick {
    private String material;
    private double length; // in cm
    private boolean isFlavored;
    private int countPerPack;

    public Toothpick() {
    }

    public void setToothpick(String material, double length, boolean isFlavored, int countPerPack) {
        this.material = material;
        this.length = length;
        this.isFlavored = isFlavored;
        this.countPerPack = countPerPack;
    }

    @Override
    public String toString() {
        return "Toothpick{material='" + material + "', length=" + length + ", isFlavored=" + isFlavored + ", countPerPack=" + countPerPack + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Toothpick) {
            Toothpick pick = (Toothpick) obj;
            if (Objects.equals(this.material, pick.material) &&
                    this.length == pick.length &&
                    this.isFlavored == pick.isFlavored &&
                    this.countPerPack == pick.countPerPack) {
                System.out.println("Toothpicks are matching..");
                return true;
            }
        }
        return false;
    }
}
