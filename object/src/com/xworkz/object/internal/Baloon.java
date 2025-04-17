package com.xworkz.object.internal;

import java.util.Objects;

public class Baloon {
    private String color;
    private double size;
    private String material;
    private boolean isHeliumFilled;

    public Baloon(String color, double size, String material, boolean isHeliumFilled) {
        this.color = color;
        this.size = size;
        this.material = material;
        this.isHeliumFilled = isHeliumFilled;
    }

    @Override
    public String toString() {
        return "Balloon{color='" + color + "', size=" + size + ", material='" + material + "', isHeliumFilled=" + isHeliumFilled + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Baloon) {
            Baloon balloon = (Baloon) obj;
            if( Objects.equals(this.material,balloon.material))
            {
                System.out.println("bottle is matching..");
                return true;
            }

        }
        return false;
    }
}
