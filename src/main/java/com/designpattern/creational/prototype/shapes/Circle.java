package com.designpattern.creational.prototype.shapes;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/13 14:55
 * @Description:
 */
public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Circle");
    }
}
