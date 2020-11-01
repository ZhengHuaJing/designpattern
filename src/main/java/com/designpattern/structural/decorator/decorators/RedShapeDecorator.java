package com.designpattern.structural.decorator.decorators;

import com.designpattern.structural.decorator.shapes.Shape;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/13 22:11
 * @Description:
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        shape.draw();
        setRedBorder();
    }

    private void setRedBorder() {
        System.out.println("增加红色边框");
    }
}
