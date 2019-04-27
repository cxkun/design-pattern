package com.cxkun.creational.builder;

/**
 * 指挥者类
 */
public class Director {
    private Builder builder;

    public Bike construct() {
        builder.buildFrame();
        builder.buildSeat();
        builder.buildTire();
        return builder.buildBike();
    }

    public Builder getBuilder() {
        return builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }
}
