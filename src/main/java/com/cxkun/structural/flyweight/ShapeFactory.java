package com.cxkun.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    private Map<String, Shape> pool = new HashMap<>();

    public Shape getShape(String color) {
        return pool.computeIfAbsent(color, k -> new Circle(color));
    }
}
