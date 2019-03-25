package com.cxkun.creational.builder.impl;

import com.cxkun.creational.builder.Packing;

public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "wrapper";
    }
}
