package com.xworkz.object.internal;

import java.util.Objects;

public class Leaf {
    private String shape;
    private String color;
    private String plantType;
    private double length;

    public Leaf(String shape, String color, String plantType, double length) {
        this.shape = shape;
        this.color = color;
        this.plantType = plantType;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Leaf{shape='" + shape + "', color='" + color + "', plantType='" + plantType + "', length=" + length + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Leaf) {
            Leaf leaf = (Leaf) obj;
            if( Objects.equals(this.plantType,leaf.plantType))
            {
                System.out.println("bottle is matching..");
                return true;
            }
        }
        return false;
    }
}
