package com.designpattern.behavioral.observer.subjects;

import com.designpattern.behavioral.observer.observers.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/14 14:59
 * @Description:
 */
public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void add(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        observers.parallelStream().forEach(Observer::update);
    }
}
