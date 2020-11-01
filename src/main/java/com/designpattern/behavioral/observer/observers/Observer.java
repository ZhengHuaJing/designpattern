package com.designpattern.behavioral.observer.observers;

import com.designpattern.behavioral.observer.subjects.Subject;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/14 14:59
 * @Description:
 */
public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}
