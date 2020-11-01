package com.designpattern.behavioral.memento.states;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/14 14:14
 * @Description:
 */
public class CareTaker {

    private List<Memento> mementos = new ArrayList<>();

    public void add(Memento memento) {
        mementos.add(memento);
    }

    public Memento get(int index) {
        return mementos.get(index);
    }
}
