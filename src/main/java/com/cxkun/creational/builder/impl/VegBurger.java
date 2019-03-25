package com.cxkun.creational.builder.impl;

import com.cxkun.creational.builder.Burger;

public class VegBurger extends Burger {
    @Override
    public String name() {
        return "veg burger";
    }

    @Override
    public float price() {
        return 1.0f;
    }
}
