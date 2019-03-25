package com.cxkun.creational.simplefactory.impl;

import com.cxkun.creational.simplefactory.Product;

public class ProductB implements Product {
    @Override
    public void name() {
        System.out.println("im product B");
    }
}
