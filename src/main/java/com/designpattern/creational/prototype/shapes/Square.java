package com.designpattern.creational.prototype.shapes;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/13 14:55
 * @Description:
 */
public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Square");
    }
}
