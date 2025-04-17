package com.xworkz.object.internal;

import java.util.Objects;

public class Fan {
    private String brand;
    private String type;
    private int speedLevels;
    private boolean hasRemote;

    public Fan(String brand, String type, int speedLevels, boolean hasRemote) {
        this.brand = brand;
        this.type = type;
        this.speedLevels = speedLevels;
        this.hasRemote = hasRemote;
    }

    @Override
    public String toString() {
        return "Fan{brand='" + brand + "', type='" + type + "', speedLevels=" + speedLevels + ", hasRemote=" + hasRemote + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Fan) {
            Fan fan = (Fan) obj;
            if( Objects.equals(this.type,fan.type))
            {
                System.out.println("bottle is matching..");
                return true;
            }
        }
        return false;
    }

}
