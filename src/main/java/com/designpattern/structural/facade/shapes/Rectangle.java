package com.designpattern.structural.facade.shapes;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/13 22:28
 * @Description:
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle");
    }
}
