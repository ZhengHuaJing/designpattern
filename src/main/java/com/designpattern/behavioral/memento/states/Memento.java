package com.designpattern.behavioral.memento.states;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/14 14:15
 * @Description:
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
