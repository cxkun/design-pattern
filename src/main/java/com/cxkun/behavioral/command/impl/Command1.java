package com.cxkun.behavioral.command.impl;

import com.cxkun.behavioral.command.Command;
import com.cxkun.behavioral.command.Receiver;

public class Command1 extends Command {
    public Command1(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        System.out.println("command 1");
        receiver.doSomething();
    }
}
