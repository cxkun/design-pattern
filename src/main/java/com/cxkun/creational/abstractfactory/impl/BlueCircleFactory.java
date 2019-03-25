package com.cxkun.creational.abstractfactory.impl;

import com.cxkun.creational.abstractfactory.Color;
import com.cxkun.creational.abstractfactory.Factory;
import com.cxkun.creational.abstractfactory.Shape;

public class BlueCircleFactory implements Factory {
    @Override
    public Color createColor() {
        return new Blue();
    }

    @Override
    public Shape createShape() {
        return new Circle();
    }
}
