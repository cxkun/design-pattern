package com.cxkun.behavioral.state;

import com.cxkun.behavioral.state.impl.High;
import com.cxkun.behavioral.state.impl.Low;

/**
 * 在状态模式（State Pattern）中，类的行为是基于它的状态改变的。这种类型的设计模式属于行为型模式。
 * 在状态模式中，我们创建表示各种状态的对象和一个行为随着状态对象改变而改变的 context 对象
 * <p>
 * 意图：允许对象在内部状态发生改变时改变它的行为，对象看起来好像修改了它的类。
 * <p>
 * 主要解决：对象的行为依赖于它的状态（属性），并且可以根据它的状态改变而改变它
 * <p>
 * 关键代码：
 * 通常命令模式的接口中只有一个方法。而状态模式的接口中有一个或者多个方法。
 * 而且，状态模式的实现类的方法，一般返回值，或者是改变实例变量的值。
 * 也就是说，状态模式一般和对象的状态有关。实现类的方法有不同的功能，覆盖接口中的方法。
 * 状态模式和命令模式一样，也可以用于消除 if...else 等条件选择语句。
 * <p>
 * 状态模式包含以下主要角色。
 * 环境（Context）角色：也称为上下文，它定义了客户感兴趣的接口，维护一个当前状态，并将与状态相关的操作委托给当前状态对象来处理。
 * 抽象状态（State）角色：定义一个接口，用以封装环境对象中的特定状态所对应的行为。
 * 具体状态（Concrete    State）角色：实现抽象状态所对应的行为。
 * <p>
 * 个人理解：
 * 当Context处在不同状态时执行的结果不相同，
 * 例如一个运动员，有三个状态，超常、正常、异常，当他超长时，可以得分120，异常时只能得分80。
 * 所以状态模式的具体执行过程由每个状态实现
 * 简而言之，状态模式就是在模拟状态机
 */
public class Demo {
    public static void main(String[] args) {
        Cooker cooker = new Cooker();
        State low = new Low();
        State high = new High();

        cooker.setState(high);
        cooker.getState().cookRice();
        cooker.getState().cookWater();
        cooker.setState(low);
        cooker.getState().cookRice();
        cooker.getState().cookWater();
    }
}
