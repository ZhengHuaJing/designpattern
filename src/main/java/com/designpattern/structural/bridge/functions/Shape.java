package com.designpattern.structural.bridge.functions;

import com.designpattern.structural.bridge.impls.DrawAPI;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/13 20:02
 * @Description:
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    public Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
