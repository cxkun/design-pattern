package com.cxkun.behavioral.state.impl;

import com.cxkun.behavioral.state.State;

public class High implements State {
    @Override
    public void cookRice() {
        System.out.println("3min");
    }

    @Override
    public void cookWater() {
        System.out.println("15min");
    }
}
