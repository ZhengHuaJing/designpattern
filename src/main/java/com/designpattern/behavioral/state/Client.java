package com.designpattern.behavioral.state;

import com.designpattern.behavioral.state.contents.Content;
import com.designpattern.behavioral.state.states.StartState;
import com.designpattern.behavioral.state.states.StopState;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/14 15:43
 * @Description: 状态模式测试
 */
public class Client {
    public static void main(String[] args) {
        Content content = new Content();

        new StartState().doAction(content);
        System.out.println(content.getState());

        new StopState().doAction(content);
        System.out.println(content.getState());
    }
}
