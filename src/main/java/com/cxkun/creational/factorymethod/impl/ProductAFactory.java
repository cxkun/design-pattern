package com.cxkun.creational.factorymethod.impl;

import com.cxkun.creational.factorymethod.Factory;
import com.cxkun.creational.factorymethod.Product;

public class ProductAFactory implements Factory {
    @Override
    public Product createProduct() {
        return new ProductA();
    }
}
