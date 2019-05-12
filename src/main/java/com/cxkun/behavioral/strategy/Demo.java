package com.cxkun.behavioral.strategy;

import com.cxkun.behavioral.strategy.impl.Add;
import com.cxkun.behavioral.strategy.impl.Minus;
import com.cxkun.behavioral.strategy.impl.Multiply;

/**
 * 在策略模式（Strategy Pattern）中，一个类的行为或其算法可以在运行时更改。这种类型的设计模式属于行为型模式。
 * 在策略模式中，我们创建表示各种策略的对象和一个行为随着策略对象改变而改变的 context 对象。策略对象改变 context 对象的执行算法。
 * <p>
 * 意图：定义一系列的算法,把它们一个个封装起来, 并且使它们可相互替换。
 * <p>
 * 主要解决：在有多种算法相似的情况下，使用 if...else 所带来的复杂和难以维护。
 * <p>
 * 策略模式的主要角色如下。
 * 抽象策略（Strategy）类：定义了一个公共接口，各种不同的算法以不同的方式实现这个接口，环境角色使用这个接口调用不同的算法，一般使用接口或抽象类实现。
 * 具体策略（Concrete Strategy）类：实现了抽象策略定义的接口，提供具体的算法实现。
 * 环境（Context）类：持有一个策略类的引用，最终给客户端调用。
 */
public class Demo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Strategy multiply = new Multiply();
        Strategy add = new Add();
        Strategy minus = new Minus();

        calculator.setStrategy(multiply);
        System.out.println(calculator.doOperation(1, 2));
        calculator.setStrategy(add);
        System.out.println(calculator.doOperation(1, 2));
        calculator.setStrategy(minus);
        System.out.println(calculator.doOperation(1, 2));
    }
}
