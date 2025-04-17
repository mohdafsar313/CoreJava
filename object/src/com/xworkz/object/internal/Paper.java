package com.xworkz.object.internal;

import java.util.Objects;

public class Paper {
    private String size;
    private String color;
    private String type;
    private double thickness;

    public Paper(String size, String color, String type, double thickness) {
        this.size = size;
        this.color = color;
        this.type = type;
        this.thickness = thickness;
    }

    @Override
    public String toString() {
        return "Paper{size='" + size + "', color='" + color + "', type='" + type + "', thickness=" + thickness + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Paper) {
            Paper paper = (Paper) obj;
            if( Objects.equals(this.type,paper.type))
            {
                System.out.println("bottle is matching..");
                return true;
            }
        }
        return false;
    }
}
