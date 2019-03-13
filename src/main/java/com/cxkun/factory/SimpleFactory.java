package com.cxkun.factory;

public class SimpleFactory {
    public Product create(String type) {
        if ("A".equalsIgnoreCase(type)) {
            return new ProductA();
        } else if ("B".equalsIgnoreCase(type)) {
            return new ProductB();
        } else if ("C".equalsIgnoreCase(type)) {
            return new ProductC();
        }

        throw new IllegalArgumentException("not support type: " + type);
    }
}
