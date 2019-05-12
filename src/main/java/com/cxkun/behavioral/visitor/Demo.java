package com.cxkun.behavioral.visitor;

import com.cxkun.behavioral.visitor.impl.Charger;
import com.cxkun.behavioral.visitor.impl.MedicinaB;
import com.cxkun.behavioral.visitor.impl.MedicineA;
import com.cxkun.behavioral.visitor.impl.WorkerOfPharmacy;

/**
 * 在访问者模式（Visitor Pattern）中，我们使用了一个访问者类，它改变了元素类的执行算法。
 * 通过这种方式，元素的执行算法可以随着访问者改变而改变。这种类型的设计模式属于行为型模式。
 * 根据模式，元素对象已接受访问者对象，这样访问者对象就可以处理元素对象上的操作。
 * <p>
 * 意图：主要将数据结构与数据操作分离。
 * <p>
 * 主要解决：稳定的数据结构和易变的操作耦合问题
 * <p>
 * 关键代码：在数据基础类里面有一个方法接受访问者，将自身引用传入访问者。
 * <p>
 * 访问者模式包含以下主要角色。
 * 抽象访问者（Visitor）角色：定义一个访问具体元素的接口，为每个具体元素类对应一个访问操作 visit() ，该操作中的参数类型标识了被访问的具体元素。
 * 具体访问者（ConcreteVisitor）角色：实现抽象访问者角色中声明的各个访问操作，确定访问者访问一个元素时该做什么。
 * 抽象元素（Element）角色：声明一个包含接受操作 accept() 的接口，被接受的访问者对象作为 accept() 方法的参数。
 * 具体元素（ConcreteElement）角色：实现抽象元素角色提供的 accept() 操作，其方法体通常都是 visitor.visit(this) ，另外具体元素中可能还包含本身业务逻辑的相关操作。
 * 对象结构（Object Structure）角色：是一个包含元素角色的容器，提供让访问者对象遍历容器中的所有元素的方法，通常由 List、Set、Map 等聚合类实现。
 * <p>
 * 例子说明:
 * 模拟医院中根据药单取药的过程，取药分为两步1 划价 2 取药。
 * 划价者、药房工作者均为visitor
 * 药品即为element
 * 最终结果由访问者、element同时决定，即访问者不同、或者element不同最终结果都不一样.
 * <p>
 * 个人理解：
 * 访问者模式的目的在于，封装一组施加于某个数据结构(ObjectStruct)元素(Element)的操作，当操作(visitor)需要改变时，数据结构无需修改。
 * 同时，可以为不同的元素提供不同的操作，且增加操作很容易，这就是访问者模式的动机
 */
public class Demo {
    public static void main(String[] args) {
        MedicineA medicineA = new MedicineA("A", 10);
        MedicinaB medicinaB = new MedicinaB("B", 20);
        Visitor charger = new Charger();
        Visitor worker = new WorkerOfPharmacy();
        Presciption presciption = new Presciption();
        presciption.add(medicineA);
        presciption.add(medicinaB);

        presciption.accept(charger);
        System.out.println();
        presciption.accept(worker);
    }
}
