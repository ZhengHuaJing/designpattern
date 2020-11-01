package com.designpattern.creational.abstractfactory.factories;

import com.designpattern.creational.abstractfactory.colors.Blue;
import com.designpattern.creational.abstractfactory.colors.Color;
import com.designpattern.creational.abstractfactory.colors.Green;
import com.designpattern.creational.abstractfactory.colors.Red;
import com.designpattern.creational.abstractfactory.shapes.Shape;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/12 16:34
 * @Description:
 */
public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(String name) {
        return null;
    }

    @Override
    public Color getColor(String name) {
        switch (name) {
            case "Blue":
                return new Blue();
            case "Green":
                return new Green();
            case "Red":
                return new Red();
            default:
                return null;
        }
    }
}
