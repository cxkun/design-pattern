package com.cxkun.creational.abstractfactory.impl;

import com.cxkun.creational.abstractfactory.Color;
import com.cxkun.creational.abstractfactory.Factory;
import com.cxkun.creational.abstractfactory.Shape;

public class GreenRectangleFactory implements Factory {
    @Override
    public Color createColor() {
        return new Green();
    }

    @Override
    public Shape createShape() {
        return new Rectangle();
    }
}
