package com.designpattern.behavioral.state.states;

import com.designpattern.behavioral.state.contents.Content;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/14 15:43
 * @Description:
 */
public class StartState implements State {

    @Override
    public void doAction(Content content) {
        content.setState(this);
    }

    @Override
    public String toString() {
        return "StartState{}";
    }
}
