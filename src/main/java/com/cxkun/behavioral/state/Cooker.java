package com.cxkun.behavioral.state;

/**
 * 表示一个电饭锅
 */
public class Cooker {
    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
