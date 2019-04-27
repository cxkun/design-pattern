package com.cxkun.creational.builder.impl;

import com.cxkun.creational.builder.Tire;

public class InflateTire implements Tire {
    @Override
    public void desc() {
        System.out.println("inflate tire");
    }
}
