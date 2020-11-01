package com.designpattern.behavioral.observer;

import com.designpattern.behavioral.observer.observers.BinaryObserver;
import com.designpattern.behavioral.observer.observers.HexaObserver;
import com.designpattern.behavioral.observer.observers.OctalObserver;
import com.designpattern.behavioral.observer.subjects.Subject;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/14 15:00
 * @Description: 观察者模式测试
 */
public class Client {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new BinaryObserver(subject);
        new HexaObserver(subject);
        new OctalObserver(subject);

        subject.setState(1);
    }
}
