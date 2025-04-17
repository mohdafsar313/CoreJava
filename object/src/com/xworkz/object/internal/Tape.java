package com.xworkz.object.internal;

import java.util.Objects;

public class Tape {
    private String color;
    private double length; // in meters
    private String type; // e.g., duct, masking
    private boolean isWaterproof;

    public Tape() {
    }

    public void setTape(String color, double length, String type, boolean isWaterproof) {
        this.color = color;
        this.length = length;
        this.type = type;
        this.isWaterproof = isWaterproof;
    }

    @Override
    public String toString() {
        return "Tape{color='" + color + "', length=" + length + "m, type='" + type + "', isWaterproof=" + isWaterproof + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Tape) {
            Tape tape = (Tape) obj;
            if (Objects.equals(this.color, tape.color) &&
                    this.length == tape.length &&
                    Objects.equals(this.type, tape.type) &&
                    this.isWaterproof == tape.isWaterproof) {
                System.out.println("Tapes are matching..");
                return true;
            }
        }
        return false;
    }
}
