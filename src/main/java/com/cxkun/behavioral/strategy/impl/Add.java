package com.cxkun.behavioral.strategy.impl;

import com.cxkun.behavioral.strategy.Strategy;

public class Add implements Strategy {
    @Override
    public int doOperation(int a, int b) {
        return a + b;
    }
}
