package com.xworkz.object.internal;

import java.util.Objects;

public class Shell {
    private String type;
    private String color;
    private double size; // in cm
    private boolean isPolished;

    public Shell() {
    }

    public void setShell(String type, String color, double size, boolean isPolished) {
        this.type = type;
        this.color = color;
        this.size = size;
        this.isPolished = isPolished;
    }

    @Override
    public String toString() {
        return "Shell{type='" + type + "', color='" + color + "', size=" + size + ", isPolished=" + isPolished + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Shell) {
            Shell shell = (Shell) obj;
            if (Objects.equals(this.type, shell.type) &&
                    Objects.equals(this.color, shell.color) &&
                    this.size == shell.size &&
                    this.isPolished == shell.isPolished) {
                System.out.println("Shells are matching..");
                return true;
            }
        }
        return false;
    }
}
