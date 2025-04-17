package com.xworkz.object.internal;

import java.util.Objects;

public class ToyCar {
    private String color;
    private String model;
    private int speed; // in km/h
    private boolean isElectric;

    public ToyCar() {
    }

    public void setToyCar(String color, String model, int speed, boolean isElectric) {
        this.color = color;
        this.model = model;
        this.speed = speed;
        this.isElectric = isElectric;
    }

    @Override
    public String toString() {
        return "ToyCar{color='" + color + "', model='" + model + "', speed=" + speed + " km/h, isElectric=" + isElectric + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof ToyCar) {
            ToyCar toyCar = (ToyCar) obj;
            if (Objects.equals(this.color, toyCar.color) &&
                    Objects.equals(this.model, toyCar.model) &&
                    this.speed == toyCar.speed &&
                    this.isElectric == toyCar.isElectric) {
                System.out.println("Toy cars are matching..");
                return true;
            }
        }
        return false;
    }
}
