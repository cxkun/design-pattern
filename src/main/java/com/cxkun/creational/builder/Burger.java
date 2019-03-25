package com.cxkun.creational.builder;

import com.cxkun.creational.builder.impl.Wrapper;

public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }
}
