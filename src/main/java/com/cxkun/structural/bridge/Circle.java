package com.cxkun.structural.bridge;

public class Circle extends Shape {
    public Circle(Fill fill) {
        super(fill);
    }

    @Override
    void draw() {
        System.out.println("im circle");
        fill.fillColor();
    }
}
