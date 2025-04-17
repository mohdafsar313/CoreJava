package com.xworkz.object.internal;

import java.util.Objects;

public class Feather {
    private String color;
    private double length;
    private String birdType;
    private boolean isSoft;

    public Feather(String color, double length, String birdType, boolean isSoft) {
        this.color = color;
        this.length = length;
        this.birdType = birdType;
        this.isSoft = isSoft;
    }

    @Override
    public String toString() {
        return "Feather{color='" + color + "', length=" + length + ", birdType='" + birdType + "', isSoft=" + isSoft + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Feather) {
            Feather feather = (Feather) obj;
            if (Objects.equals(this.birdType, feather.birdType)) {
                System.out.println(" matching..");
                return true;
            }
        }
        return false;
    }
}
