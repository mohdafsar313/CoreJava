package com.xworkz.object.internal;

import java.util.Objects;

public class Hat {
    private String color;
    private String size; // e.g., Small, Medium, Large
    private String material; // e.g., Cotton, Wool, Leather
    private String style; // e.g., Baseball, Fedora, Beanie

    public Hat() {
    }

    public void setHat(String color, String size, String material, String style) {
        this.color = color;
        this.size = size;
        this.material = material;
        this.style = style;
    }

    @Override
    public String toString() {
        return "Hat{color='" + color + "', size='" + size + "', material='" + material + "', style='" + style + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Hat) {
            Hat hat = (Hat) obj;
            if (Objects.equals(this.color, hat.color) &&
                    Objects.equals(this.size, hat.size) &&
                    Objects.equals(this.material, hat.material) &&
                    Objects.equals(this.style, hat.style)) {
                System.out.println("Hats are matching..");
                return true;
            }
        }
        return false;
    }
}
