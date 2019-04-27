package com.cxkun.structural.composite;

/**
 * 意图：将对象组合成树形结构以表示"部分-整体"的层次结构。组合模式使得用户对单个对象和组合对象的使用具有一致性。
 * 主要解决：它在我们树型结构的问题中，模糊了简单元素和复杂元素的概念，客户程序可以向处理简单元素一样来处理复杂元素，从而使得客户程序与复杂元素的内部结构解耦。
 *
 * 使用该模式的关键在于，将部分和整体抽象成为同一类对象
 * 本例中将目录和文件都抽象为Entry对象，这样就可以将目录、文件统一处理了
 */
public class Demo {
    public static void main(String[] args) {
        Entry root = new Folder("root");
        Entry etc = new Folder("etc");
        Entry usr = new Folder("usr");
        Entry fileA = new File("a", 100);
        Entry fileB = new File("b", 10000);
        Entry fileC = new File("c", 102);
        Entry fileD = new File("d", 27198);
        root.add(etc);
        root.add(usr);
        root.add(fileA);
        etc.add(fileB);
        etc.add(fileC);
        usr.add(fileD);

        System.out.println(root.getSize());
        root.printList();
    }
}
