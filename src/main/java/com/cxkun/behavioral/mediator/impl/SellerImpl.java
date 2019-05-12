package com.cxkun.behavioral.mediator.impl;

import com.cxkun.behavioral.mediator.Mediator;
import com.cxkun.behavioral.mediator.Seller;

public class SellerImpl implements Seller {
    private final Mediator mediator;
    private final int price;

    public SellerImpl(Mediator mediator, int price) {
        this.mediator = mediator;
        this.price = price;
        mediator.registerSeller(this);
    }

    @Override
    public void sell() {
        mediator.sell(this);
    }

    @Override
    public int getPrice() {
        return price;
    }
}
