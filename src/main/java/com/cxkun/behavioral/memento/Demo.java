package com.cxkun.behavioral.memento;

import com.sun.tools.corba.se.idl.constExpr.Or;

/**
 * 备忘录模式（Memento Pattern）保存一个对象的某个状态，以便在适当的时候恢复对象。备忘录模式属于行为型模式。
 * <p>
 * 意图：在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。
 * <p>
 * 主要解决：所谓备忘录模式就是在不破坏封装的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态，这样可以在以后将对象恢复到原先保存的状态。
 * <p>
 * 关键代码：客户不与备忘录类耦合，与备忘录管理类耦合。
 * <p>
 * 备忘录模式的主要角色如下
 * 发起人（Originator）角色：记录当前时刻的内部状态信息，提供创建备忘录和恢复备忘录数据的功能，实现其他业务功能，它可以访问备忘录里的所有信息。
 * 备忘录（Memento）角色：负责存储发起人的内部状态，在需要的时候提供这些内部状态给发起人。
 * 管理者（Caretaker）角色：对备忘录进行管理，提供保存与获取备忘录的功能，但其不能对备忘录的内容进行访问与修改。
 * <p>
 * 个人理解：
 * 发起人即为状态生产者，管理者可以管理一系列备忘录，每个备忘录只存储某一个阶段的状态,
 * 所以客户端仅仅和发起人，管理者产生依赖，并不依赖备忘录，
 * 如果只需要存储一个阶段的状态，例如实现类似回退上一步操作，仅支持回退一步，则不需要管理者，客户端可以喝memento直接依赖，但这样的实现用处并不大
 */
public class Demo {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("1");
        originator.setState("2");
        careTaker.add(originator.saveToMemento());
        originator.setState("3");
        careTaker.add(originator.saveToMemento());
        originator.setState("4");

        System.out.println("current " + originator.getState());
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("first " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("second " + originator.getState());
    }
}
