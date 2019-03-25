package com.cxkun.creational.builder.impl;

import com.cxkun.creational.builder.ColdDrink;

public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "coke";
    }

    @Override
    public float price() {
        return 4.0f;
    }
}
