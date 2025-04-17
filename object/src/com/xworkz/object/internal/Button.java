package com.xworkz.object.internal;

import java.util.Objects;

public class Button {
    private String shape;
    private String color;
    private int size;
    private boolean isPlastic;

    public Button(String shape, String color, int size, boolean isPlastic) {
        this.shape = shape;
        this.color = color;
        this.size = size;
        this.isPlastic = isPlastic;
    }

    @Override
    public String toString() {
        return "Button{shape='" + shape + "', color='" + color + "', size=" + size + ", isPlastic=" + isPlastic + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Button) {
            Button button = (Button) obj;
            if( Objects.equals(this.shape,button.shape))
            {
                System.out.println("matching..");
                return true;
            }
        }
        return false;
    }
}
