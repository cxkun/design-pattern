package com.cxkun.creational.prototype;

public class Square extends Shape {
    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::fill() method.");
    }
}
