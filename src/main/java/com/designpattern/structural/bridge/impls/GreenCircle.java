package com.designpattern.structural.bridge.impls;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/13 20:02
 * @Description:
 */
public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("GreenCircle");
    }
}
