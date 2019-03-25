package com.cxkun.creational.factorymethod;

import com.cxkun.creational.factorymethod.impl.ProductAFactory;
import com.cxkun.creational.factorymethod.impl.ProductBFactory;
import com.cxkun.creational.factorymethod.impl.ProductCFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class FactoryMethodTest {
    @Test
    public void test() {
        Factory factoryA = new ProductAFactory();
        factoryA.createProduct().name();

        Factory factoryB = new ProductBFactory();
        factoryB.createProduct().name();

        Factory factoryC = new ProductCFactory();
        factoryC.createProduct().name();
    }
}
