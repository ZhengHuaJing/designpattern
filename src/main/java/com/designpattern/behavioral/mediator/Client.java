package com.designpattern.behavioral.mediator;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/14 12:02
 * @Description: 中介者模式测试
 */
public class Client {
    public static void main(String[] args) {
        User user1 = new User("张三");
        User user2 = new User("李四");

        user1.sendMessage("hello, 李四");
        user2.sendMessage("hello, 张三");
    }
}
