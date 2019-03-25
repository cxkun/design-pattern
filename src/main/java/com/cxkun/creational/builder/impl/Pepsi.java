package com.cxkun.creational.builder.impl;

import com.cxkun.creational.builder.ColdDrink;

public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "pepsi";
    }

    @Override
    public float price() {
        return 3.0f;
    }
}
