package com.xworkz.jdbc.external;

import com.xworkz.jdbc.internal.Shape;

public class ShapeManager {
    private Shape shape;

    public ShapeManager(Shape shape) {
        this.shape = shape;
    }

    public void displayShape() {
        this.shape.draw();
    }
}
