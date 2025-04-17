package com.xworkz.object.internal;

import java.util.Objects;

public class Cap {
    private String color;
    private String size;
    private String material;
    private boolean isAdjustable;

    public Cap(String color, String size, String material, boolean isAdjustable) {
        this.color = color;
        this.size = size;
        this.material = material;
        this.isAdjustable = isAdjustable;
    }

    @Override
    public String toString() {
        return "Cap{color='" + color + "', size='" + size + "', material='" + material + "', isAdjustable=" + isAdjustable + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Cap) {
            Cap cap = (Cap) obj;
            if (Objects.equals(this.material, cap.material)) {
                System.out.println(" matching..");
                return true;
            }
        }
        return false;
    }
}
