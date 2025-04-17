package com.xworkz.object.internal;

import java.util.Objects;

public class Ring {
    private String material;
    private double size;
    private String gemstone;
    private boolean isGold;

    public Ring(String material, double size, String gemstone, boolean isGold) {
        this.material = material;
        this.size = size;
        this.gemstone = gemstone;
        this.isGold = isGold;
    }

    @Override
    public String toString() {
        return "Ring{material='" + material + "', size=" + size + ", gemstone='" + gemstone + "', isGold=" + isGold + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Ring) {
            Ring ring = (Ring) obj;
            if (Objects.equals(this.material, ring.material)) {
                System.out.println(" matching..");
                return true;
            }
        }
        return false;
    }
}
