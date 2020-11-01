package com.designpattern.structural.flyweight.shapes;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/13 22:48
 * @Description:
 */
public class Circle implements Shape {
    private int radius;
    private String color;

    public Circle(String color) {
        this.color = color;
    }

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void draw() {
        System.out.printf("Circle{radius=%d, color=%s}\n", radius, color);
    }
}
