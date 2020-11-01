package com.designpattern.creational.factorymethod;

import com.designpattern.creational.factorymethod.shapes.Shape;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/12 15:34
 * @Description: 工厂方法模式测试
 */
public class Client {
    public static void main(String[] args) {
        Shape circle = ShapeFactory.getShape("Circle");
        circle.draw();

        Shape square = ShapeFactory.getShape("Square");
        square.draw();

        Shape rectangle = ShapeFactory.getShape("Rectangle");
        rectangle.draw();
    }
}
