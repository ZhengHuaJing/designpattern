package com.designpattern.structural.facade;

import com.designpattern.creational.prototype.shapes.Circle;
import com.designpattern.creational.prototype.shapes.Rectangle;
import com.designpattern.creational.prototype.shapes.Shape;
import com.designpattern.creational.prototype.shapes.Square;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/13 22:29
 * @Description:
 */
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}
