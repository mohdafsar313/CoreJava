package com.xworkz.object.internal;

import java.util.Objects;

public class Sand {
    private String color;
    private double grainSize;
    private boolean isWet;
    private String location;

    public Sand(String color, double grainSize, boolean isWet, String location) {
        this.color = color;
        this.grainSize = grainSize;
        this.isWet = isWet;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Sand{color='" + color + "', grainSize=" + grainSize + ", isWet=" + isWet + ", location='" + location + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Sand) {
            Sand sand = (Sand) obj;
            if (Objects.equals(this.grainSize, sand.grainSize)) {
                System.out.println(" matching..");
                return true;
            }
        }
        return false;
    }
}
