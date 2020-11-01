package com.designpattern.creational.abstractfactory.factories;

import com.designpattern.creational.abstractfactory.colors.Color;
import com.designpattern.creational.abstractfactory.shapes.Circle;
import com.designpattern.creational.abstractfactory.shapes.Rectangle;
import com.designpattern.creational.abstractfactory.shapes.Shape;
import com.designpattern.creational.abstractfactory.shapes.Square;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/12 16:33
 * @Description:
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String name) {
        switch (name) {
            case "Circle":
                return new Circle();
            case "Rectangle":
                return new Rectangle();
            case "Square":
                return new Square();
            default:
                return null;
        }
    }

    @Override
    public Color getColor(String name) {
        return null;
    }
}
