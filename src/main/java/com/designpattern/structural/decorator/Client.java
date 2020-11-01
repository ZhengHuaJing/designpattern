package com.designpattern.structural.decorator;

import com.designpattern.structural.decorator.decorators.RedShapeDecorator;
import com.designpattern.structural.decorator.shapes.Circle;
import com.designpattern.structural.decorator.shapes.Rectangle;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/13 22:10
 * @Description: 装饰器模式测试
 */
public class Client {
    public static void main(String[] args) {
        RedShapeDecorator redShapeDecorator1 = new RedShapeDecorator(new Circle());
        RedShapeDecorator redShapeDecorator2 = new RedShapeDecorator(new Rectangle());

        redShapeDecorator1.draw();
        redShapeDecorator2.draw();
    }
}
