package com.designpattern.behavioral.mediator;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/14 12:02
 * @Description:
 */
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public void sendMessage(String message) {
        ChatRoom.showMessage(this, message);
    }
}
