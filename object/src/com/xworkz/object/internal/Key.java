package com.xworkz.object.internal;

import java.util.Objects;

public class Key {
    private String material;
    private double length;
    private String keyType;
    private boolean isDuplicate;

    public Key(String material, double length, String keyType, boolean isDuplicate) {
        this.material = material;
        this.length = length;
        this.keyType = keyType;
        this.isDuplicate = isDuplicate;
    }

    @Override
    public String toString() {
        return "Key{material='" + material + "', length=" + length + ", keyType='" + keyType + "', isDuplicate=" + isDuplicate + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Key) {
            Key key = (Key) obj;
            if (Objects.equals(this.material, key.material)) {
                System.out.println(" matching..");
                return true;
            }
        }
        return false;
    }
}
