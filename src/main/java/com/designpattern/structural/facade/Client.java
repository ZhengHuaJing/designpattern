package com.designpattern.structural.facade;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/13 22:29
 * @Description: 外观模式测试
 */
public class Client {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
