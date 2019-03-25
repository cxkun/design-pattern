package com.cxkun.creational.abstractfactory;

import com.cxkun.creational.abstractfactory.impl.BlueCircleFactory;
import com.cxkun.creational.abstractfactory.impl.GreenRectangleFactory;
import com.cxkun.creational.abstractfactory.impl.RedSquareFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class AbstractFactoryTest {
    @Test
    public void test() {
        Factory redSquareFactory = new RedSquareFactory();
        Factory greenRectangelFactory = new GreenRectangleFactory();
        Factory blueCircleFactory = new BlueCircleFactory();

        redSquareFactory.createColor().color();
        redSquareFactory.createShape().shape();

        greenRectangelFactory.createColor().color();
        greenRectangelFactory.createShape().shape();

        blueCircleFactory.createColor().color();
        blueCircleFactory.createShape().shape();
    }
}
