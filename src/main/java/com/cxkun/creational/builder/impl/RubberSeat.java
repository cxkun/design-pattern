package com.cxkun.creational.builder.impl;

import com.cxkun.creational.builder.Seat;

public class RubberSeat implements Seat {
    @Override
    public void desc() {
        System.out.println("rubber seat");
    }
}
