package com.cxkun.creational.abstractfactory.impl;

import com.cxkun.creational.abstractfactory.Shape;

public class Circle implements Shape {
    @Override
    public void shape() {
        System.out.println("im circle");
    }
}
