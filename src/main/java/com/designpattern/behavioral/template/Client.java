package com.designpattern.behavioral.template;

import com.designpattern.behavioral.template.games.Cricket;
import com.designpattern.behavioral.template.games.Football;
import com.designpattern.behavioral.template.games.Game;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/14 16:50
 * @Description: 模板模式测试
 */
public class Client {
    public static void main(String[] args) {
        Game cricket = new Cricket();
        cricket.play();

        Game football = new Football();
        football.play();
    }
}
