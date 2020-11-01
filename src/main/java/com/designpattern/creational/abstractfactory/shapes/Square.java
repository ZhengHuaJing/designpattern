package com.designpattern.creational.abstractfactory.shapes;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/12 16:38
 * @Description:
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Square");
    }
}
