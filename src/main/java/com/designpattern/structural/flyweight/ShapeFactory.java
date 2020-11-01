package com.designpattern.structural.flyweight;

import com.designpattern.structural.flyweight.shapes.Circle;
import com.designpattern.structural.flyweight.shapes.Shape;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/13 22:48
 * @Description:
 */
public class ShapeFactory {
    private Map<String, Shape> circleMap;

    public ShapeFactory() {
        circleMap = new HashMap<>();

        Circle circle1 = new Circle(10, "red");
        Circle circle2 = new Circle(9, "green");
        Circle circle3 = new Circle(19, "blue");
        Circle circle4 = new Circle(23, "black");
        Circle circle5 = new Circle(6, "white");

        circleMap.put(circle1.getColor(), circle1);
        circleMap.put(circle2.getColor(), circle2);
        circleMap.put(circle3.getColor(), circle3);
        circleMap.put(circle4.getColor(), circle4);
        circleMap.put(circle5.getColor(), circle5);
    }

    public Circle getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);
        return circle == null ? (Circle) circleMap.put(color, new Circle(color)) : circle;
    }
}
