package com.designpattern.creational.abstractfactory;

import com.designpattern.creational.abstractfactory.factories.AbstractFactory;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/12 16:30
 * @Description: 抽象工厂模式测试
 */
public class Client {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("Shape");
        shapeFactory.getShape("Circle").draw();
        shapeFactory.getShape("Square").draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("Color");
        colorFactory.getColor("Red").fill();
        colorFactory.getColor("Green").fill();
    }
}
