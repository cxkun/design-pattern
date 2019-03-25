package com.cxkun.creational.builder.impl;

import com.cxkun.creational.builder.Packing;

public class Bottle implements Packing {
    @Override
    public String pack() {
        return "bottle";
    }
}
