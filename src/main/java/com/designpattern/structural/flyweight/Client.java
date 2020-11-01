package com.designpattern.structural.flyweight;

import com.designpattern.structural.flyweight.shapes.Circle;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/13 22:48
 * @Description: 享元模式测试
 */
public class Client {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Circle circle1 = shapeFactory.getCircle("red");
        circle1.draw();

        Circle circle2 = shapeFactory.getCircle("blue");
        circle2.draw();
    }
}
