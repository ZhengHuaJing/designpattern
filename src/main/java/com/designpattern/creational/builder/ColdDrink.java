package com.designpattern.creational.builder;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/12 19:39
 * @Description:
 */
public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    public abstract double price();
}
