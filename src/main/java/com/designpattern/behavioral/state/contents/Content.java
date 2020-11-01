package com.designpattern.behavioral.state.contents;

import com.designpattern.behavioral.state.states.State;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/14 15:43
 * @Description:
 */
public class Content {

    private State state;

    public Content() {
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
