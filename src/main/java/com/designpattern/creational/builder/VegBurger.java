package com.designpattern.creational.builder;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/12 19:39
 * @Description:
 */
public class VegBurger extends Burger {

    @Override
    public String name() {
        return "VegBurger";
    }

    @Override
    public double price() {
        return 12.9;
    }
}
