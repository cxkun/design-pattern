package com.cxkun.behavioral.mediator;

import com.cxkun.behavioral.mediator.impl.BuyerImpl;
import com.cxkun.behavioral.mediator.impl.MediatorImpl;
import com.cxkun.behavioral.mediator.impl.SellerImpl;

/**
 * 中介者模式（Mediator Pattern）是用来降低多个对象和类之间的通信复杂性。这种模式提供了一个中介类，该类通常处理不同类之间的通信，并支持松耦合，使代码易于维护。中介者模式属于行为型模式。
 *
 * 意图：用一个中介对象来封装一系列的对象交互，中介者使各对象不需要显式地相互引用，从而使其耦合松散，而且可以独立地改变它们之间的交互。
 *
 * 主要解决：对象与对象之间存在大量的关联关系，这样势必会导致系统的结构变得很复杂，同时若一个对象发生改变，我们也需要跟踪与之相关联的对象，同时做出相应的处理。
 *
 * 关键代码：对象 Colleague 之间的通信封装到一个类中单独处理。
 *
 * 中介者含义与现实生活中中介的含义类似，在现实生活中，有很多中介者模式的身影，例如QQ游戏平台，聊天室、QQ群、短信平台和房产中介。
 * 例如房产中介实现了，买房之间，卖方之间以及买方卖方之间的所有关系的隔离，所有人只和中介直接产生关系，这样将原有的复杂网状关系改变成了星状结构。
 *
 *
 */
public class Demo {
    public static void main(String[] args) {
        Mediator mediator = new MediatorImpl();
        Buyer buyerA = new BuyerImpl(mediator, 10);
        Buyer buyerB = new BuyerImpl(mediator, 2);
        Seller sellerA = new SellerImpl(mediator, 10);
        Seller sellerB = new SellerImpl(mediator, 30);
        buyerA.buy();
        buyerB.buy();
        sellerB.sell();
        // 会报错
        sellerA.sell();
    }

}
