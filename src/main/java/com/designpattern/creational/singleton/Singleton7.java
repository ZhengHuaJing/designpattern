package com.designpattern.creational.singleton;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/8 06:23
 * @Description: 静态内部类：在实际开发中推荐使用
 */
public class Singleton7 {
    private Singleton7() {
    }

    private static class SingletonInner {
        private static final Singleton7 INSTANCE = new Singleton7();
    }

    public static Singleton7 getInstance() {
        return SingletonInner.INSTANCE;
    }
}
