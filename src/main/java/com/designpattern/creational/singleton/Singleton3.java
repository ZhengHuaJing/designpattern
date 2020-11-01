package com.designpattern.creational.singleton;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/12 07:55
 * @Description: 懒汉式（线程不安全）：在实际开发中不要使用
 */
public class Singleton3 {
    private static Singleton3 instance;

    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        return instance == null ? instance = new Singleton3() : instance;
    }
}
