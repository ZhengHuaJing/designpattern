package com.designpattern.creational.singleton;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/12 07:58
 * @Description: 双重检查：在实际开发中推荐使用
 */
public class Singleton6 {
    // volatile: 确保每个线程获得的都是变量的最新状态
    private volatile static Singleton6 instance;

    private Singleton6() {
    }

    public static Singleton6 getInstance() {
        if (instance == null) {
            synchronized (Singleton6.class) {
                if (instance == null) {
                    instance = new Singleton6();
                }
            }
        }

        return instance;
    }
}
