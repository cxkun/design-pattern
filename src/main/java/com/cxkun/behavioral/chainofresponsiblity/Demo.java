package com.cxkun.behavioral.chainofresponsiblity;

/**
 * 意图：避免请求发送者与接收者耦合在一起，让多个对象都有可能接收请求，将这些对象连接成一条链，并且沿着这条链传递请求，直到有对象处理它为止。
 * 主要解决：职责链上的处理者负责处理请求，客户只需要将请求发送到职责链上即可，无须关心请求的处理细节和请求的传递，所以职责链将请求的发送者和请求的处理者解耦了。
 *
 * 例子：servlet filters即为典型的责任链模式
 */
public class Demo {
    private static Logger createLoggerChain() {
        Logger error = new ErrorLogger(Logger.ERROR, null);
        Logger file = new FileLogger(Logger.INFO, error);
        return new FileLogger(Logger.DEBUG, file);
    }
    public static void main(String[] args) {
        Logger chain = createLoggerChain();
        chain.log("error", Logger.ERROR);
        System.out.println();
        chain.log("info", Logger.INFO);
        System.out.println();
        chain.log("debug", Logger.DEBUG);
    }
}
