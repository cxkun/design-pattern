package com.cxkun.factory;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class SimpleFactoryTest {
    @Test
    public void testCreat() {
        SimpleFactory factory = new SimpleFactory();
        Product product;
        product = factory.create("A");
        product.name();
        product = factory.create("B");
        product.name();
        product = factory.create("C");
        product.name();
    }
}