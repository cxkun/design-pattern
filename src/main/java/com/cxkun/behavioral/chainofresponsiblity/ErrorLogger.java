package com.cxkun.behavioral.chainofresponsiblity;

public class ErrorLogger extends Logger {
    private static final String TPL = "[%s] error logger: %s";

    public ErrorLogger(int level, Logger next) {
        super(level, next);
    }

    @Override
    protected void writeLog(String message, int level) {
        System.out.println(String.format(TPL, level, message));
    }
}
