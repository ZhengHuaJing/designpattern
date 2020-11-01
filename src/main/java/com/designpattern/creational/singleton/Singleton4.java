package com.designpattern.creational.singleton;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/12 07:56
 * @Description: 懒汉式（线程安全，同步方法）：在实际开发中不要使用
 */
public class Singleton4 {
    private static Singleton4 instance;

    private Singleton4() {
    }

    public synchronized static Singleton4 getInstance() {
        if (instance == null) {
            instance = new Singleton4();
        }

        return instance;
    }
}
