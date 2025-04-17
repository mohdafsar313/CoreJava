package com.xworkz.object.internal;

import java.util.Objects;

public class Napkin {
    private String material;
    private String color;
    private String size;
    private boolean isDisposable;

    public Napkin() {
    }

    public void setNapkin(String material, String color, String size, boolean isDisposable) {
        this.material = material;
        this.color = color;
        this.size = size;
        this.isDisposable = isDisposable;
    }

    @Override
    public String toString() {
        return "Napkin{material='" + material + "', color='" + color + "', size='" + size + "', isDisposable=" + isDisposable + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Napkin) {
            Napkin napkin = (Napkin) obj;
            if (Objects.equals(this.material, napkin.material) &&
                    Objects.equals(this.color, napkin.color) &&
                    Objects.equals(this.size, napkin.size) &&
                    this.isDisposable == napkin.isDisposable) {
                System.out.println("Napkins are matching..");
                return true;
            }
        }
        return false;
    }

}
