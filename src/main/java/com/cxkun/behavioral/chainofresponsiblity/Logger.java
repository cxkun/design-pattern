package com.cxkun.behavioral.chainofresponsiblity;

public abstract class Logger {
    public static final int DEBUG = 1;
    public static final int INFO = 2;
    public static final int ERROR = 3;

    protected int level;

    protected Logger next;

    public Logger(int level, Logger next) {
        this.level = level;
        this.next = next;
    }

    public void setNext(Logger next) {
        this.next = next;
    }

    public void log(String log, int level) {
        if (this.level <= level) {
            writeLog(log, level);
        }
        if (this.next != null) {
            next.log(log, level);
        }
    }

    protected abstract void writeLog(String message, int level);
}
