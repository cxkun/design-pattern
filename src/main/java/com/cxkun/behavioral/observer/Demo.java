package com.cxkun.behavioral.observer;

import com.cxkun.behavioral.observer.impl.ObeserverImpl;
import com.cxkun.behavioral.observer.impl.SubjectImpl;

/**
 * 意图：定义对象间的一种一对多的依赖关系，当一个对象的状态发生改变时，所有依赖于它的对象都得到通知并被自动更新。
 * <p>
 * 主要解决：一个对象状态改变给其他对象通知的问题，而且要考虑到易用和低耦合，保证高度的协作。
 * <p>
 * 关键代码：在抽象类里有一个 ArrayList 存放观察者们。
 *
 * 观察者模式的主要角色如下。
 * 抽象主题（Subject）角色：也叫抽象目标类，它提供了一个用于保存观察者对象的聚集类和增加、删除观察者对象的方法，以及通知所有观察者的抽象方法。
 * 具体主题（Concrete    Subject）角色：也叫具体目标类，它实现抽象目标中的通知方法，当具体主题的内部状态发生改变时，通知所有注册过的观察者对象。
 * 抽象观察者（Observer）角色：它是一个抽象类或接口，它包含了一个更新自己的抽象方法，当接到具体主题的更改通知时被调用。
 * 具体观察者（Concrete Observer）角色：实现抽象观察者中定义的抽象方法，以便在得到目标的更改通知时更新自身的状态。
 *
 * 个人理解:
 * 观察者和主题是抽象耦合的，增加主题实现，和观察者实现，都是很容易的
 */
public class Demo {
    public static void main(String[] args) {
        Subject<Integer> subject = new SubjectImpl<>();
        Observer observer1 = new ObeserverImpl(subject);
        Observer observer2 = new ObeserverImpl(subject);
        subject.add(observer1);
        subject.add(observer2);

        subject.setState(1);
        subject.setState(2);
        subject.setState(3);
    }
}
