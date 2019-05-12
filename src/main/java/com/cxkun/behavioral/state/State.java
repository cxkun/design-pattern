package com.cxkun.behavioral.state;

/**
 * 这是一个电饭锅的状态的抽象表示，电饭锅状态很简单，三个档位1、2、3，表示小火、中火、大火
 */
public interface State {
    /**
     * 蒸米饭
     */
    void cookRice();

    /**
     * 烧水
     */
    void cookWater();
}
