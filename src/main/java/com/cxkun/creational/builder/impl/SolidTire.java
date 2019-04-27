package com.cxkun.creational.builder.impl;

import com.cxkun.creational.builder.Tire;

public class SolidTire implements Tire {
    @Override
    public void desc() {
        System.out.println("solid tire");
    }
}
