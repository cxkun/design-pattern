package com.cxkun.behavioral.template.impl;

import com.cxkun.behavioral.template.Coffee;

public class Americano extends Coffee {
    @Override
    public boolean isAddSugar() {
        return false;
    }

    @Override
    public void addMilk() {
        System.out.println("什么都不添加");
    }
}
