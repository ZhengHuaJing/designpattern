package com.designpattern.creational.singleton;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/12 16:54
 * @Description: 单例模式测试
 */
public class Client {
    public static void main(String[] args) {
        Singleton7 instance1 = Singleton7.getInstance();
        Singleton7 instance2 = Singleton7.getInstance();
        System.out.println(instance1 == instance2);
    }
}
