package com.xworkz.object.internal;

import java.util.Objects;

public class Candle {
    private String color;
    private String scent;
    private double height;
    private int burnTime; // in minutes

    public Candle() {
    }

    public void setCandle(String color, String scent, double height, int burnTime) {
        this.color = color;
        this.scent = scent;
        this.height = height;
        this.burnTime = burnTime;
    }

    @Override
    public String toString() {
        return "Candle{color='" + color + "', scent='" + scent + "', height=" + height + ", burnTime=" + burnTime + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Candle) {
            Candle candle = (Candle) obj;
            if (Objects.equals(this.color, candle.color) &&
                    Objects.equals(this.scent, candle.scent) &&
                    this.height == candle.height &&
                    this.burnTime == candle.burnTime) {
                System.out.println("Candles are matching..");
                return true;
            }
        }
        return false;
    }
}
