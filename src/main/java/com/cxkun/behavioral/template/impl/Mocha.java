package com.cxkun.behavioral.template.impl;

import com.cxkun.behavioral.template.Coffee;

public class Mocha extends Coffee {
    @Override
    public void addMilk() {
        System.out.println("添加奶泡");
    }
}

