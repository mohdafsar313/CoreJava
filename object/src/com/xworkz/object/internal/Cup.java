package com.xworkz.object.internal;

import java.util.Objects;

public class Cup {
    private String material;
    private String color;
    private double capacity; // in ml
    private boolean hasHandle;

    public Cup(String material, String color, double capacity, boolean hasHandle) {
        this.material = material;
        this.color = color;
        this.capacity = capacity;
        this.hasHandle = hasHandle;
    }

    @Override
    public String toString() {
        return "Cup{material='" + material + "', color='" + color + "', capacity=" + capacity + ", hasHandle=" + hasHandle + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Cup) {
            Cup cup = (Cup) obj;
            if( Objects.equals(this.material,cup.material))
            {
                System.out.println(" matching..");
                return true;
            }
        }
        return false;
    }
}
