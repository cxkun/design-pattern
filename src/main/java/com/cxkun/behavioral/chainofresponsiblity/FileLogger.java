package com.cxkun.behavioral.chainofresponsiblity;

public class FileLogger extends Logger {
    private static final String TPL = "[%s] file logger: %s";

    public FileLogger(int level, Logger next) {
        super(level, next);
    }

    @Override
    protected void writeLog(String message, int level) {
        System.out.println(String.format(TPL, level, message));
    }
}
