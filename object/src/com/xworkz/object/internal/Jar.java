package com.xworkz.object.internal;

import java.util.Objects;

public class Jar {
    private String material;
    private String shape;
    private double capacity;
    private int cost;

    public Jar() {
    }

    public void setJar(String material, String shape, double capacity, int cost) {
        this.material = material;
        this.shape = shape;
        this.capacity = capacity;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Jar{material='" + material + "', shape='" + shape + "', capacity=" + capacity + ", cost=" + cost + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Jar) {
            Jar jar = (Jar) obj;
            if (Objects.equals(this.material, jar.material) &&
                    Objects.equals(this.shape, jar.shape) &&
                    this.capacity == jar.capacity &&
                    this.cost == jar.cost) {
                System.out.println("Jars are matching..");
                return true;
            }
        }
        return false;
    }
}
