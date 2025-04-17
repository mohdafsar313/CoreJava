package com.xworkz.object.internal;

import java.util.Objects;

public class Clip {
    private String material; // e.g., Metal, Plastic
    private String color;
    private int size; // size in mm
    private boolean isSpringLoaded;

    public Clip() {
    }

    public void setClip(String material, String color, int size, boolean isSpringLoaded) {
        this.material = material;
        this.color = color;
        this.size = size;
        this.isSpringLoaded = isSpringLoaded;
    }

    @Override
    public String toString() {
        return "Clip{material='" + material + "', color='" + color + "', size=" + size + "mm, isSpringLoaded=" + isSpringLoaded + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Clip) {
            Clip clip = (Clip) obj;
            if (Objects.equals(this.material, clip.material) &&
                    Objects.equals(this.color, clip.color) &&
                    this.size == clip.size &&
                    this.isSpringLoaded == clip.isSpringLoaded) {
                System.out.println("Clips are matching..");
                return true;
            }
        }
        return false;
    }
}
