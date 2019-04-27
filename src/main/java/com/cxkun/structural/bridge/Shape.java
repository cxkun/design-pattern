package com.cxkun.structural.bridge;

public abstract class Shape {
    protected final Fill fill;

    public Shape(Fill fill) {
        this.fill = fill;
    }

    public Fill getFill() {
        return fill;
    }

    abstract void draw();
}
