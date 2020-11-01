package com.designpattern.creational.singleton;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/12 07:55
 * @Description: 饿汉式（静态代码块）：这种单例模式可用，但是可能造成内存浪费
 */
public class Singleton2 {
    private static Singleton2 instance;

    static {
        instance = new Singleton2();
    }

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        return instance;
    }
}
