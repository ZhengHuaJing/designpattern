package com.designpattern.creational.prototype;

import com.designpattern.creational.prototype.shapes.Circle;
import com.designpattern.creational.prototype.shapes.Rectangle;
import com.designpattern.creational.prototype.shapes.Shape;
import com.designpattern.creational.prototype.shapes.Square;

import java.util.HashMap;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/13 14:49
 * @Description:
 */
public class ShapeCache {
    private static HashMap<String, Shape> shapeMap = new HashMap<>();

    public static Shape getShape(String shapeId) {
        return shapeMap.get(shapeId);
    }

    public static void loadCache() {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Square square = new Square();

        circle.setId("1");
        rectangle.setId("2");
        square.setId("3");

        shapeMap.put(circle.getId(), circle);
        shapeMap.put(rectangle.getId(), rectangle);
        shapeMap.put(square.getId(), square);
    }
}
