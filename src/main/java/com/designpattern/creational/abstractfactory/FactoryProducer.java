package com.designpattern.creational.abstractfactory;

import com.designpattern.creational.abstractfactory.factories.AbstractFactory;
import com.designpattern.creational.abstractfactory.factories.ColorFactory;
import com.designpattern.creational.abstractfactory.factories.ShapeFactory;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/12 16:33
 * @Description:
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String name) {
        switch (name) {
            case "Shape":
                return new ShapeFactory();
            case "Color":
                return new ColorFactory();
            default:
                return null;
        }
    }
}
