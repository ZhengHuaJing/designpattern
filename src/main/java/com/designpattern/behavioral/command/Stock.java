package com.designpattern.behavioral.command;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/14 10:26
 * @Description:
 */
public class Stock {
    private String name;
    private int quantity;

    public void buy() {
        System.out.println("buy");
    }

    public void sell() {
        System.out.println("sell");
    }
}
