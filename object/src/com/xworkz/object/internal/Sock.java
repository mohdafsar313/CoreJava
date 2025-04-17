package com.xworkz.object.internal;

import java.util.Objects;

public class Sock {
    private String color;
    private String size;
    private String material;
    private boolean isPatterned;

    public Sock() {
    }

    public void setSock(String color, String size, String material, boolean isPatterned) {
        this.color = color;
        this.size = size;
        this.material = material;
        this.isPatterned = isPatterned;
    }

    @Override
    public String toString() {
        return "Sock{color='" + color + "', size='" + size + "', material='" + material + "', isPatterned=" + isPatterned + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Sock) {
            Sock sock = (Sock) obj;
            if (Objects.equals(this.color, sock.color) &&
                    Objects.equals(this.size, sock.size) &&
                    Objects.equals(this.material, sock.material) &&
                    this.isPatterned == sock.isPatterned) {
                System.out.println("Socks are matching..");
                return true;
            }
        }
        return false;
    }
}
