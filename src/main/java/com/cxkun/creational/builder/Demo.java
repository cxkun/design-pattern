package com.cxkun.creational.builder;

import com.cxkun.creational.builder.impl.MobikeBuilder;
import com.cxkun.creational.builder.impl.OfoBikeBuilder;

/**
 * 意图：将一个复杂的构建与其表示相分离，使得同样的构建过程可以创建不同的表示。
 * 主要解决：主要解决在软件系统中，有时候面临着"一个复杂对象"的创建工作，其通常由各个部分的子对象用一定的算法构成；由于需求的变化，这个复杂对象的各个部分经常面临着剧烈的变化，但是将它们组合在一起的算法却相对稳定
 *
 *
 * 建造过程被抽象为Builder类，Director负责使用Builder创建出不同的对象，客户端完全无需关心创建过程是怎样的
 * 有时会将抽象的Builder与Director合二为一，如此代码结构会简单些，但是这违反了单一职责原则，当被Builder创建的对象比较复杂时，还是使用Director类比较好
 *
 */

public class Demo {
    public static void main(String[] args) {
        Builder mobikeBUilder = new MobikeBuilder();
        Builder ofoBuilder = new OfoBikeBuilder();
        Director director = new Director();
        director.setBuilder(mobikeBUilder);
        director.construct().desc();
        director.setBuilder(ofoBuilder);
        director.construct().desc();
    }
}
