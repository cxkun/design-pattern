package com.cxkun.structural.decorator;

/**
 * 意图：动态地给一个对象添加一些额外的职责。就增加功能来说，装饰器模式相比生成子类更为灵活。
 * 主要解决：一般的，我们为了扩展一个类经常使用继承方式实现，由于继承为类引入静态特征，并且随着扩展功能的增多，子类会很膨胀。
 *
 * 使用改模式的关键在于，装饰器和被装饰者有着同样的抽象类，这样在客户端使用时，调用被装饰者和调用装饰器没有任何区别，
 * 但是，背后的逻辑是不同的，这允许在不修改客户端和被装饰者的情况下完成代码逻辑的修改，完美符合开闭原则
 */
public class Demo {
    public static void main(String[] args) {
        Component decoratee = new ConcreteComponent();
        Component decoratorA = new ConcreteDecoratorA(decoratee);
        Component decoratorB = new ConcreteDecoratorB(decoratorA);

        decoratee.operation();
        System.out.println();
        decoratorA.operation();
        System.out.println();
        decoratorB.operation();
    }
}
