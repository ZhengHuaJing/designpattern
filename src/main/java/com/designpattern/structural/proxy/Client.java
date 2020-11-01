package com.designpattern.structural.proxy;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/14 08:11
 * @Description: 代理模式测试
 */
public class Client {
    public static void main(String[] args) {
        ProxyImage proxyImage = new ProxyImage("1.png");
        proxyImage.display();
        proxyImage.display();
    }
}
