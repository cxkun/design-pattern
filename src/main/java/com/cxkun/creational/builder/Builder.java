package com.cxkun.creational.builder;

public interface Builder {
    void buildFrame();
    void buildSeat();
    void buildTire();
    Bike buildBike();
}
