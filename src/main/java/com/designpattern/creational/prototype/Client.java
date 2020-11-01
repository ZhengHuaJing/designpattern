package com.designpattern.creational.prototype;

import com.designpattern.creational.prototype.shapes.Circle;
import com.designpattern.creational.prototype.shapes.Rectangle;
import com.designpattern.creational.prototype.shapes.Square;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/13 14:48
 * @Description: 原型模式测试
 */
public class Client {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Circle circle = (Circle) ShapeCache.getShape("1");
        circle.draw();

        Rectangle rectangle = (Rectangle) ShapeCache.getShape("2");
        rectangle.draw();

        Square square = (Square) ShapeCache.getShape("3");
        square.draw();
    }
}
