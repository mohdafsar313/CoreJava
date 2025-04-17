package com.xworkz.object.internal;

import java.util.Objects;

public class Hanger {
    private String material;
    private String color;
    private boolean hasClips;
    private int weightCapacity; // in kilograms

    public Hanger() {
    }

    public void setHanger(String material, String color, boolean hasClips, int weightCapacity) {
        this.material = material;
        this.color = color;
        this.hasClips = hasClips;
        this.weightCapacity = weightCapacity;
    }

    @Override
    public String toString() {
        return "Hanger{material='" + material + "', color='" + color + "', hasClips=" + hasClips + ", weightCapacity=" + weightCapacity + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Hanger) {
            Hanger hanger = (Hanger) obj;
            if (Objects.equals(this.material, hanger.material) &&
                    Objects.equals(this.color, hanger.color) &&
                    this.hasClips == hanger.hasClips &&
                    this.weightCapacity == hanger.weightCapacity) {
                System.out.println("Hangers are matching..");
                return true;
            }
        }
        return false;
    }
}
