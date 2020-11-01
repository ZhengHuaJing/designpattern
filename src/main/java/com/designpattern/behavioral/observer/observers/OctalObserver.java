package com.designpattern.behavioral.observer.observers;

import com.designpattern.behavioral.observer.subjects.Subject;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/14 15:06
 * @Description:
 */
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        subject.add(this);
    }

    @Override
    public void update() {
        System.out.println("OctalObserver已更新");
    }
}
