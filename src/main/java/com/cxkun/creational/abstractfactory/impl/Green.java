package com.cxkun.creational.abstractfactory.impl;

import com.cxkun.creational.abstractfactory.Color;

public class Green implements Color {
    @Override
    public void color() {
        System.out.println("im green");
    }
}
