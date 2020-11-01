package com.designpattern.creational.factorymethod.shapes;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/12 15:55
 * @Description:
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square");
    }
}
