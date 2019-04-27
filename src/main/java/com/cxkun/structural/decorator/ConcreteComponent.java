package com.cxkun.structural.decorator;

public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("im concrete component");
    }
}
