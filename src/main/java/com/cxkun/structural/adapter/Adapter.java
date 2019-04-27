package com.cxkun.structural.adapter;

/**
 * 适配逻辑实现类，
 * 最终效果：Adaptee对象可以当做Target对象来使用
 */
public class Adapter implements Target {
    private final Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.adapteeRequest();
    }

    @Override
    public void test() {
        adaptee.adapteeTest();
    }

    public Adaptee getAdaptee() {
        return adaptee;
    }
}
