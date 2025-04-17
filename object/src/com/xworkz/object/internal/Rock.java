package com.xworkz.object.internal;

import java.util.Objects;

public class Rock {
    private String type;
    private double weight;
    private String color;
    private boolean isPolished;

    public Rock(String type, double weight, String color, boolean isPolished) {
        this.type = type;
        this.weight = weight;
        this.color = color;
        this.isPolished = isPolished;
    }

    @Override
    public String toString() {
        return "Rock{type='" + type + "', weight=" + weight + ", color='" + color + "', isPolished=" + isPolished + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Rock) {
            Rock rock = (Rock) obj;
            if( Objects.equals(this.type,rock.type))
            {
                System.out.println("matching..");
                return true;
            }
        }
        return false;
    }
}
