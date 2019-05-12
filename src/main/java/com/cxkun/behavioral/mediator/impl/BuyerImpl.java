package com.cxkun.behavioral.mediator.impl;

import com.cxkun.behavioral.mediator.Buyer;
import com.cxkun.behavioral.mediator.Mediator;

public class BuyerImpl implements Buyer {
    private final Mediator mediator;
    private final int price;

    public BuyerImpl(Mediator mediator, int price) {
        this.mediator = mediator;
        this.price = price;
        mediator.registerBuyer(this);
    }

    @Override
    public void buy() {
        mediator.buy(this);
    }

    @Override
    public int getPrice() {
        return price;
    }
}
