package com.cxkun.behavioral.strategy;

public class Calculator {
    private Strategy strategy;
    public int doOperation(int a, int b) {
        return strategy.doOperation(a, b);
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
