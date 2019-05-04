package com.cxkun.behavioral.command;

/**
 * Invoker 中可以做一些额外操作，例如记录command的历史、实现回退操作等等
 *
 * 回退操作的实现，使用栈来存储使用过的命令，回退则出栈一个命令并执行相反的操作
 */
public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void action() {
        command.execute();
    }
}
