package com.designpattern.behavioral.state.states;

import com.designpattern.behavioral.state.contents.Content;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/14 15:43
 * @Description:
 */
public interface State {
    void doAction(Content content);
}
