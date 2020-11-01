package com.designpattern.structural.bridge.functions;

import com.designpattern.structural.bridge.impls.DrawAPI;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/13 20:02
 * @Description:
 */
public class Circle extends Shape {
    private int x;
    private int y;
    private int radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }

}
