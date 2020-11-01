package com.designpattern.creational.singleton;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/12 07:57
 * @Description: 懒汉式（线程安全，同步代码块）: 在实际开发中不要使用
 */
public class Singleton5 {
    private static Singleton5 instance;

    private Singleton5() {
    }

    public static Singleton5 getInstance() {
        if (instance == null) {
            synchronized (Singleton5.class) {
                instance = new Singleton5();
            }
        }

        return instance;
    }
}
