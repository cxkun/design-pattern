package com.cxkun.creational.builder;

import com.cxkun.creational.builder.impl.Bottle;

public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }
}
