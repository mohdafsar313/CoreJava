package com.xworkz.object.internal;

import java.util.Objects;

public class ToyTrain {
    private String color;
    private String model;
    private int numberOfCars;
    private boolean isBatteryOperated;

    public ToyTrain() {
    }

    public void setToyTrain(String color, String model, int numberOfCars, boolean isBatteryOperated) {
        this.color = color;
        this.model = model;
        this.numberOfCars = numberOfCars;
        this.isBatteryOperated = isBatteryOperated;
    }

    @Override
    public String toString() {
        return "ToyTrain{color='" + color + "', model='" + model + "', numberOfCars=" + numberOfCars + ", isBatteryOperated=" + isBatteryOperated + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof ToyTrain) {
            ToyTrain toyTrain = (ToyTrain) obj;
            if (Objects.equals(this.color, toyTrain.color) &&
                    Objects.equals(this.model, toyTrain.model) &&
                    this.numberOfCars == toyTrain.numberOfCars &&
                    this.isBatteryOperated == toyTrain.isBatteryOperated) {
                System.out.println("Toy trains are matching..");
                return true;
            }
        }
        return false;
    }
}
