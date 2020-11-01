package com.designpattern.behavioral.memento;

import com.designpattern.behavioral.memento.states.CareTaker;
import com.designpattern.behavioral.memento.states.Memento;
import com.designpattern.behavioral.memento.states.Originator;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/14 14:15
 * @Description: 备忘录模式
 */
public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("存档一");
        System.out.println(originator.getState());

        Memento memento = originator.saveStateToMemento();
        CareTaker careTaker = new CareTaker();
        careTaker.add(memento);
        originator.setState("存档二");
        System.out.println(originator.getState());

        originator.recoverStateFromMemento(careTaker.get(0));
        System.out.println(originator.getState());

    }
}
