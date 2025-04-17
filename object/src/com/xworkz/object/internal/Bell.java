package com.xworkz.object.internal;

import java.util.Objects;

public class Bell {
    private String material;
    private double size; // in cm
    private String color;
    private boolean isRinging;

    public Bell() {
    }

    public void setBell(String material, double size, String color, boolean isRinging) {
        this.material = material;
        this.size = size;
        this.color = color;
        this.isRinging = isRinging;
    }

    @Override
    public String toString() {
        return "Bell{material='" + material + "', size=" + size + ", color='" + color + "', isRinging=" + isRinging + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Bell) {
            Bell bell = (Bell) obj;
            if (Objects.equals(this.material, bell.material) &&
                    this.size == bell.size &&
                    Objects.equals(this.color, bell.color) &&
                    this.isRinging == bell.isRinging) {
                System.out.println("Bells are matching..");
                return true;
            }
        }
        return false;
    }
}
