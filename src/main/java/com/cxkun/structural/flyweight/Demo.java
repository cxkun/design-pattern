package com.cxkun.structural.flyweight;

/**
 * 意图：运用共享技术有效地支持大量细粒度的对象。
 * 主要解决：在有大量对象时，有可能会造成内存溢出，我们把其中共同的部分抽象出来，如果有相同的业务请求，直接返回在内存中已有的对象，避免重新创建。
 *
 * 享元模式是池技术实现的重要方式
 */
public class Demo {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Circle blue = (Circle) factory.getShape("blue");
        blue.setX(1);
        blue.setY(1);
        blue.setRadius(10);
        blue.draw();

        Circle blue2 = (Circle) factory.getShape("blue");
        blue2.setX(2);
        blue2.setY(1);
        blue2.setRadius(10);
        blue2.draw();

        System.out.println(blue == blue2);

        Circle red = (Circle) factory.getShape("red");
        red.setX(1);
        red.setY(1);
        red.setRadius(1000);
        red.draw();
    }
}
