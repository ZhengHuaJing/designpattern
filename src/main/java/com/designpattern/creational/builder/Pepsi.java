package com.designpattern.creational.builder;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/12 19:40
 * @Description:
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public double price() {
        return 9;
    }
}
