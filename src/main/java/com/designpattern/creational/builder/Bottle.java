package com.designpattern.creational.builder;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/12 19:39
 * @Description:
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
