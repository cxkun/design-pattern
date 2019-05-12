package com.cxkun.behavioral.iterator;

/**
 * 意图：提供一种方法顺序访问一个聚合对象中各个元素, 而又无须暴露该对象的内部表示。
 * <p>
 * 主要解决：不同的方式来遍历整个整合对象。
 *
 * 关键代码：定义接口：hasNext, next。
 */
public class Demo {
    public static void main(String[] args) {
        NameRepository repository = new NameRepository();
        Iterator iterator = repository.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
