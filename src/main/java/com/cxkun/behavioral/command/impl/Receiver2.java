package com.cxkun.behavioral.command.impl;

import com.cxkun.behavioral.command.Receiver;

public class Receiver2 implements Receiver {
    @Override
    public void doSomething() {
        System.out.println("receiver 2");
    }
}
