package com.designpattern.structural.facade.shapes;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/13 22:27
 * @Description:
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle");
    }
}
