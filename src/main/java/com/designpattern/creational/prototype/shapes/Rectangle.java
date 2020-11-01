package com.designpattern.creational.prototype.shapes;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/13 14:55
 * @Description:
 */
public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Rectangle");
    }
}
