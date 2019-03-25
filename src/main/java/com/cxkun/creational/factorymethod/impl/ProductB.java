package com.cxkun.creational.factorymethod.impl;

import com.cxkun.creational.factorymethod.Product;

public class ProductB implements Product {
    @Override
    public void name() {
        System.out.println("im product B");
    }
}
