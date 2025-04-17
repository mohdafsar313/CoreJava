package com.xworkz.object.internal;

import java.util.Objects;

public class Sticker {
    private String design;
    private String color;
    private String material; // e.g., paper, vinyl
    private double size; // in cm

    public Sticker() {
    }

    public void setSticker(String design, String color, String material, double size) {
        this.design = design;
        this.color = color;
        this.material = material;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Sticker{design='" + design + "', color='" + color + "', material='" + material + "', size=" + size + "cm}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Sticker) {
            Sticker sticker = (Sticker) obj;
            if (Objects.equals(this.design, sticker.design) &&
                    Objects.equals(this.color, sticker.color) &&
                    Objects.equals(this.material, sticker.material) &&
                    this.size == sticker.size) {
                System.out.println("Stickers are matching..");
                return true;
            }
        }
        return false;
    }
}
