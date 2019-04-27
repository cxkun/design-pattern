package com.cxkun.structural.bridge;

/**
 * 意图：将抽象部分与实现部分分离，使它们都可以独立的变化。
 * 主要解决：在有多种可能会变化的情况下，用继承会造成类爆炸问题，扩展起来不灵活。
 * 本例中，Shape为抽象部分，Fill这个动作为实现部分，Fill是draw Shape中的一个动作，可以让Shape和Fill独立变化，达到解耦的目的
 */
public class Demo {
    public static void main(String[] args) {
        Fill blue = new FillBlue();
        Shape blueCircle = new Circle(blue);
        Fill red = new FillRed();
        Shape redCircle = new Circle(red);

        blueCircle.draw();
        redCircle.draw();
    }
}
