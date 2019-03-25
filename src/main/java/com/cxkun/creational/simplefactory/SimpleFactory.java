package com.cxkun.creational.simplefactory;

import com.cxkun.creational.simplefactory.impl.ProductA;
import com.cxkun.creational.simplefactory.impl.ProductB;
import com.cxkun.creational.simplefactory.impl.ProductC;

public class SimpleFactory {
    public static Product create(String type) {
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
