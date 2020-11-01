package com.designpattern.structural.bridge;

import com.designpattern.structural.bridge.functions.Circle;
import com.designpattern.structural.bridge.impls.GreenCircle;
import com.designpattern.structural.bridge.impls.RedCircle;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/13 20:02
 * @Description: 桥接模式测试
 */
public class Client {
    public static void main(String[] args) {
        Circle circle1 = new Circle(10, 20, 5, new RedCircle());
        Circle circle2 = new Circle(10, 20, 5, new GreenCircle());

        circle1.draw();
        circle2.draw();
    }
}
