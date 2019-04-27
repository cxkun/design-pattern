package com.cxkun.creational.builder.impl;

import com.cxkun.creational.builder.Bike;
import com.cxkun.creational.builder.Builder;

public class OfoBikeBuilder implements Builder {
    private Bike bike = new Bike();

    @Override
    public void buildFrame() {
        bike.setFrame(new CarbonFrame());
    }

    @Override
    public void buildSeat() {
        bike.setSeat(new RubberSeat());
    }

    @Override
    public void buildTire() {
        bike.setTire(new InflateTire());
    }

    @Override
    public Bike buildBike() {
        return bike;
    }
}
