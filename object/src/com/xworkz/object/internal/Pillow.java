package com.xworkz.object.internal;

import java.util.Objects;

public class Pillow {
    private String material;
    private String size;
    private String color;
    private boolean isWashable;

    public Pillow() {
    }

    public void setPillow(String material, String size, String color, boolean isWashable) {
        this.material = material;
        this.size = size;
        this.color = color;
        this.isWashable = isWashable;
    }

    @Override
    public String toString() {
        return "Pillow{material='" + material + "', size='" + size + "', color='" + color + "', isWashable=" + isWashable + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Pillow) {
            Pillow pillow = (Pillow) obj;
            if (Objects.equals(this.material, pillow.material) &&
                    Objects.equals(this.size, pillow.size) &&
                    Objects.equals(this.color, pillow.color) &&
                    this.isWashable == pillow.isWashable) {
                System.out.println("Pillows are matching..");
                return true;
            }
        }
        return false;
    }
}
