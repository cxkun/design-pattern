package com.cxkun.behavioral.mediator;

public interface Mediator {
    void registerSeller(Seller seller);
    void registerBuyer(Buyer buyer);
    void sell(Seller seller);
    void buy(Buyer buyer);
}
