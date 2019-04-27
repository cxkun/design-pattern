package com.cxkun.structural.facade;

/**
 * 意图：为子系统中的一组接口提供一个一致的界面，外观模式定义了一个高层接口，这个接口使得这一子系统更加容易使用。
 * 主要解决：降低访问复杂系统的内部子系统时的复杂度，简化客户端与之的接口
 *
 * 该模式的关键在于，组合子系统的功能，并提供统一易用的接口，客户端无需了解系统内部复杂的关系，直接调用接口即可，
 * 即使系统内部有变化，只要"外观"不变，客户端就无需改变
 */
public class Demo {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.start();
        System.out.println();
        computer.shutdonw();
    }
}
