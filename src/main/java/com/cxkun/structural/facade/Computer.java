package com.cxkun.structural.facade;

public class Computer {
    private CPU cpu;
    private Memory memory;
    private Disk disk;

    public Computer() {
        cpu = new CPU();
        memory = new Memory();
        disk = new Disk();
    }

    public void start() {
        System.out.println("computer start begin");
        cpu.start();
        memory.start();
        disk.start();
        System.out.println("computer start end");
    }

    public void shutdonw() {
        System.out.println("computer shutdown begin");
        cpu.shutdonw();
        memory.shutdonw();
        disk.shutdonw();
        System.out.println("computer shutdown end");
    }
}
