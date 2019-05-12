package com.cxkun.behavioral.state.impl;

import com.cxkun.behavioral.state.State;

public class Middle implements State {
    @Override
    public void cookRice() {
        System.out.println("5min");
    }

    @Override
    public void cookWater() {
        System.out.println("30min");
    }
}
