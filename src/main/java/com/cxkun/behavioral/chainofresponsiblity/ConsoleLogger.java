package com.cxkun.behavioral.chainofresponsiblity;

public class ConsoleLogger extends Logger {
    private static final String TPL = "[%s] console logger: %s";

    public ConsoleLogger(int level, Logger next) {
        super(level, next);
    }

    @Override
    protected void writeLog(String message, int level) {
        System.out.println(String.format(TPL, level, message));
    }
}
