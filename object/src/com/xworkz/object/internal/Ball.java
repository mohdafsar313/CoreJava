package com.xworkz.object.internal;

import java.util.Objects;

public class Ball {
    private String color;
    private String material;
    private double diameter;
    private boolean isBouncy;

    public Ball(String color, String material, double diameter, boolean isBouncy) {
        this.color = color;
        this.material = material;
        this.diameter = diameter;
        this.isBouncy = isBouncy;
    }

    @Override
    public String toString() {
        return "Ball{color='" + color + "', material='" + material + "', diameter=" + diameter + ", isBouncy=" + isBouncy + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Ball) {
            Ball ball = (Ball) obj;
            if (Objects.equals(this.material, ball.material)) {
                System.out.println(" matching..");
                return true;
            }
        }
        return false;
    }
}
