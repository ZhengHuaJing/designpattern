package com.designpattern.creational.abstractfactory.factories;

import com.designpattern.creational.abstractfactory.colors.Color;
import com.designpattern.creational.abstractfactory.shapes.Shape;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/12 16:32
 * @Description:
 */
public abstract class AbstractFactory {
    public abstract Shape getShape(String name);

    public abstract Color getColor(String name);
}
