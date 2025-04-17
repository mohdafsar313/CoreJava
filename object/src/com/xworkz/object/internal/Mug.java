package com.xworkz.object.internal;

import java.util.Objects;

public class Mug {
    private String color;
    private String material;
    private double capacity;
    private int cost;

    public Mug() {
    }

    public void setMug(String color, String material, double capacity, int cost) {
        this.color = color;
        this.material = material;
        this.capacity = capacity;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Mug{color='" + color + "', material='" + material + "', capacity=" + capacity + ", cost=" + cost + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Mug) {
            Mug mug = (Mug) obj;
            if (Objects.equals(this.material, mug.material) &&
                    this.capacity == mug.capacity &&
                    this.cost == mug.cost) {
                System.out.println("Mugs are matching..");
                return true;
            }
        }
        return false;
    }
}
