package com.cxkun.behavioral.command.impl;

import com.cxkun.behavioral.command.Command;
import com.cxkun.behavioral.command.Receiver;

public class Command2 extends Command {
    public Command2(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        System.out.println("command 2");
        receiver.doSomething();
    }
}
