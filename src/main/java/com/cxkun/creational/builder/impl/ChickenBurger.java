package com.cxkun.creational.builder.impl;

import com.cxkun.creational.builder.Burger;

public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "chicken burger";
    }

    @Override
    public float price() {
        return 2.0f;
    }
}
