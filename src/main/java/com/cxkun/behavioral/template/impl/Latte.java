package com.cxkun.behavioral.template.impl;

import com.cxkun.behavioral.template.Coffee;

/**
 * 假定摩卡添加奶泡而拿铁添加纯牛奶，至于实际是否如此不关心
 */
public class Latte extends Coffee {
    @Override
    public void addMilk() {
        System.out.println("添加纯牛奶");
    }
}
