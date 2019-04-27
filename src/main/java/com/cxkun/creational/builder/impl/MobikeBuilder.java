package com.cxkun.creational.builder.impl;

import com.cxkun.creational.builder.Bike;
import com.cxkun.creational.builder.Builder;

public class MobikeBuilder implements Builder {
    private Bike bike = new Bike();

    @Override
    public void buildFrame() {
        bike.setFrame(new AlloyFrame());
    }

    @Override
    public void buildSeat() {
        bike.setSeat(new DermisSeat());
    }

    @Override
    public void buildTire() {
        bike.setTire(new SolidTire());
    }

    @Override
    public Bike buildBike() {
        return bike;
    }
}
