package com.cxkun.behavioral.template;

import com.cxkun.behavioral.template.impl.Americano;
import com.cxkun.behavioral.template.impl.Latte;
import com.cxkun.behavioral.template.impl.Mocha;

/**
 * 在模板模式（Template Pattern）中，一个抽象类公开定义了执行它的方法的方式/模板。
 * 它的子类可以按需要重写方法实现，但调用将以抽象类中定义的方式进行。这种类型的设计模式属于行为型模式。
 *
 * 意图：定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。模板方法使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。
 *
 * 主要解决：一些方法通用，却在每一个子类都重新写了这一方法。
 *
 * 模式的结构
 * 模板方法模式包含以下主要角色。
 * (1) 抽象类（Abstract Class）：负责给出一个算法的轮廓和骨架。它由一个模板方法和若干个基本方法构成。这些方法的定义如下。
 * ① 模板方法：定义了算法的骨架，按某种顺序调用其包含的基本方法。
 * ② 基本方法：是整个算法中的一个步骤，包含以下几种类型。
 * 抽象方法：在抽象类中申明，由具体子类实现。
 * 具体方法：在抽象类中已经实现，在具体子类中可以继承或重写它。
 * 钩子方法：在抽象类中已经实现，包括用于判断的逻辑方法和需要子类重写的空方法两种。
 * 钩子方法说明：用于子类控制父类模板的执行，子类可以控制某一步骤是否要执行（用于判断的逻辑方法）或者按照新的方式执行（空方法），
 * (2) 具体子类（Concrete Class）：实现抽象类中所定义的抽象方法和钩子方法，它们是一个顶级逻辑的一个组成步骤。
 *
 */
public class Demo {
    public static void main(String[] args) {
        Coffee latte = new Latte();
        latte.make();
        System.out.println();
        Coffee mocha = new Mocha();
        mocha.make();
        System.out.println();
        Coffee americano = new Americano();
        americano.make();
        System.out.println();
    }
}
