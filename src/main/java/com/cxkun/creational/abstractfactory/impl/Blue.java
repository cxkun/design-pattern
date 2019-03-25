package com.cxkun.creational.abstractfactory.impl;

import com.cxkun.creational.abstractfactory.Color;

public class Blue implements Color {
    @Override
    public void color() {
        System.out.println("im blue");
    }
}
