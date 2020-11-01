package com.designpattern.structural.decorator.decorators;

import com.designpattern.structural.decorator.shapes.Shape;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/13 22:10
 * @Description:
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    public abstract void draw();
}
