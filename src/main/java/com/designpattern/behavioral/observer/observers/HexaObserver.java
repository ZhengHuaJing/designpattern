package com.designpattern.behavioral.observer.observers;

import com.designpattern.behavioral.observer.subjects.Subject;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/14 14:59
 * @Description:
 */
public class HexaObserver extends Observer {

    public HexaObserver(Subject subject) {
        subject.add(this);
    }

    @Override
    public void update() {
        System.out.println("HexaObserver已更新");
    }
}
