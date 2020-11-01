package com.designpattern.creational.factorymethod;

import com.designpattern.creational.factorymethod.shapes.Circle;
import com.designpattern.creational.factorymethod.shapes.Rectangle;
import com.designpattern.creational.factorymethod.shapes.Shape;
import com.designpattern.creational.factorymethod.shapes.Square;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/12 15:54
 * @Description:
 */
public class ShapeFactory {
    /**
     * 根据 name 返回对应的类实例对象
     *
     * @param name
     * @return
     */
    public static Shape getShape(String name) {
        switch (name) {
            case "Circle":
                return new Circle();
            case "Square":
                return new Square();
            case "Rectangle":
                return new Rectangle();
            default:
                return null;
        }
    }
}
