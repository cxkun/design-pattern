package com.cxkun.behavioral.command;

import com.cxkun.behavioral.command.impl.Command1;
import com.cxkun.behavioral.command.impl.Command2;
import com.cxkun.behavioral.command.impl.Receiver1;
import com.cxkun.behavioral.command.impl.Receiver2;

/**
 * 意图：将一个请求封装成一个对象，从而使您可以用不同的请求对客户进行参数化。
 *
 * 主要解决：在软件系统中，行为请求者与行为实现者通常是一种紧耦合的关系，
 * 但某些场合，比如需要对行为进行记录、撤销或重做、事务等处理时，这种无法抵御变化的紧耦合的设计就不太合适。
 *
 * 关键代码：定义三个角色：
 * 1.Receiver接受者角色：该角色就是干活的角色，命令传递到这里是应该被执行的
 * 2.Command命令角色：需要执行的所有命令都在这里声明
 * 3.Invoker调用者角色：接收到命令，并执行命令
 *
 * Invoker和Receiver玩全解耦，不相互依赖，Command的扩展也很容易
 */
public class Demo {
    public static void main(String[] args) {
        Receiver receiver1 = new Receiver1();
        Receiver receiver2 = new Receiver2();

        Command command1 = new Command1(receiver1);
        Command command2 = new Command2(receiver1);

        Command command3 = new Command1(receiver1);
        Command command4 = new Command2(receiver2);

        Invoker invoker = new Invoker();
        invoker.setCommand(command1);
        invoker.action();

        invoker.setCommand(command2);
        invoker.action();

        invoker.setCommand(command3);
        invoker.action();

        invoker.setCommand(command4);
        invoker.action();
    }
}
