package com.xworkz.object.internal;

import java.util.Objects;

public class Stick {
    private String material;
    private double length;
    private String type;
    private boolean isStraight;

    public Stick(String material, double length, String type, boolean isStraight) {
        this.material = material;
        this.length = length;
        this.type = type;
        this.isStraight = isStraight;
    }

    @Override
    public String toString() {
        return "Stick{material='" + material + "', length=" + length + ", type='" + type + "', isStraight=" + isStraight + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Stick) {
            Stick stick = (Stick) obj;
            if (Objects.equals(this.material, stick.material)) {
                System.out.println(" matching..");
                return true;
            }
        }
        return false;
    }
}
