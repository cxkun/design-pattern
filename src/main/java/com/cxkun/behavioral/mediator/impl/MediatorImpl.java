package com.cxkun.behavioral.mediator.impl;

import com.cxkun.behavioral.mediator.Buyer;
import com.cxkun.behavioral.mediator.Mediator;
import com.cxkun.behavioral.mediator.Seller;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Queue;

public class MediatorImpl implements Mediator {
    Map<Integer, Queue<Seller>> sellerMap = new HashMap<>();
    Map<Integer, Queue<Buyer>> buyerMap = new HashMap<>();

    @Override
    public void registerSeller(Seller seller) {
        Queue<Seller> sellers = sellerMap.computeIfAbsent(seller.getPrice(), k -> new LinkedList<>());
        sellers.add(seller);
    }

    @Override
    public void registerBuyer(Buyer buyer) {
        Queue<Buyer> buyers = buyerMap.computeIfAbsent(buyer.getPrice(), k -> new LinkedList<>());
        buyers.add(buyer);
    }

    @Override
    public void sell(Seller seller) {
        validateSeller(seller);

        Queue<Buyer> buyers = buyerMap.get(seller.getPrice());
        if (buyers == null || buyers.size() == 0) {
            System.out.println("trade failed, no buyers for price " + seller.getPrice());
        } else {
            buyers.poll();
            System.out.println("trade success, price " + seller.getPrice());
        }
    }

    private void validateSeller(Seller seller) {
        LinkedList sellers = (LinkedList) sellerMap.get(seller.getPrice());
        if (sellers == null || sellers.size() == 0) {
            throw new RuntimeException("illegal seller");
        } else {
            ListIterator iterator = sellers.listIterator();
            while (iterator.hasNext()) {
                if (iterator.next() == seller) {
                    iterator.remove();
                    return;
                }
            }
            throw new RuntimeException("illegal seller");
        }
    }

    @Override
    public void buy(Buyer buyer) {
        validateBuyer(buyer);

        Queue<Seller> sellers = sellerMap.get(buyer.getPrice());
        if (sellers == null || sellers.size() == 0) {
            System.out.println("trade failed, no sellers for price " + buyer.getPrice());
        } else {
            sellers.poll();
            System.out.println("trade success, price " + buyer.getPrice());
        }
    }

    private void validateBuyer(Buyer buyer) {
        LinkedList buyers = (LinkedList) buyerMap.get(buyer.getPrice());
        if (buyers == null || buyers.size() == 0) {
            throw new RuntimeException("illegal buyer");
        } else {
            ListIterator iterator = buyers.listIterator();
            while (iterator.hasNext()) {
                if (iterator.next() == buyer) {
                    iterator.remove();
                    return;
                }
            }
            throw new RuntimeException("illegal buyer");
        }
    }
}
