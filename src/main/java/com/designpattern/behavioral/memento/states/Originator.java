package com.designpattern.behavioral.memento.states;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/14 14:15
 * @Description:
 */
public class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    public void recoverStateFromMemento(Memento memento) {
        state = memento.getState();
    }
}
