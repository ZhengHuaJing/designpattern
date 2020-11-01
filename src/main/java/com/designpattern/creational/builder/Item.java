package com.designpattern.creational.builder;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/12 19:38
 * @Description:
 */
public interface Item {
    String name();

    Packing packing();

    double price();
}
