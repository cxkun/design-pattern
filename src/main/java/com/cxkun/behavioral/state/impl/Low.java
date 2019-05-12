package com.cxkun.behavioral.state.impl;

import com.cxkun.behavioral.state.State;

public class Low implements State {
    @Override
    public void cookRice() {
        System.out.println("10min");
    }

    /**
     * 假定小火时，烧水永远烧不开
     */
    @Override
    public void cookWater() {
        throw new UnsupportedOperationException();
    }
}
