package com.cxkun.creational.abstractfactory.impl;

import com.cxkun.creational.abstractfactory.Color;
import com.cxkun.creational.abstractfactory.Factory;
import com.cxkun.creational.abstractfactory.Shape;

public class RedSquareFactory implements Factory {
    @Override
    public Color createColor() {
        return new Red();
    }

    @Override
    public Shape createShape() {
        return new Square();
    }
}
