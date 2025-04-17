package com.xworkz.object.internal;

import java.util.Objects;

public class Coin {
    private String country;
    private int year;
    private double value;
    private String material;

    public Coin(String country, int year, double value, String material) {
        this.country = country;
        this.year = year;
        this.value = value;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Coin{country='" + country + "', year=" + year + ", value=" + value + ", material='" + material + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Coin) {
            Coin coin = (Coin) obj;
            if (Objects.equals(this.country, coin.country)) {
                System.out.println(" matching..");
                return true;
            }
        }
        return false;
    }
}
