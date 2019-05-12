package com.cxkun.behavioral.iterator;

/**
 * 这个接口相当于java中的Iterable接口，Iterable子类都可以使用Iterator进行遍历
 */
public interface Container {
    Iterator getIterator();
}
