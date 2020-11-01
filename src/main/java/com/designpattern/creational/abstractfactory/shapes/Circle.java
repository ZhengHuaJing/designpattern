package com.designpattern.creational.abstractfactory.shapes;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/12 16:34
 * @Description:
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle");
    }
}
