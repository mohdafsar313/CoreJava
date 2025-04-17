package com.xworkz.object.internal;

import java.util.Objects;

public class Bubble {
    private String color;
    private double size; // in cm
    private String type; // e.g., soap, gum
    private boolean isFloating;

    public Bubble() {
    }

    public void setBubble(String color, double size, String type, boolean isFloating) {
        this.color = color;
        this.size = size;
        this.type = type;
        this.isFloating = isFloating;
    }

    @Override
    public String toString() {
        return "Bubble{color='" + color + "', size=" + size + "cm, type='" + type + "', isFloating=" + isFloating + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Bubble) {
            Bubble bubble = (Bubble) obj;
            if (Objects.equals(this.color, bubble.color) &&
                    this.size == bubble.size &&
                    Objects.equals(this.type, bubble.type) &&
                    this.isFloating == bubble.isFloating) {
                System.out.println("Bubbles are matching..");
                return true;
            }
        }
        return false;
    }
}
