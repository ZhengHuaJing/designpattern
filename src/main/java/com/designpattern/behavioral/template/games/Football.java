package com.designpattern.behavioral.template.games;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/14 16:52
 * @Description:
 */
public class Football extends Game {
    @Override
    public void initialize() {
        System.out.println("Football-initialize");
    }

    @Override
    public void startPlay() {
        System.out.println("Football-startPlay");
    }

    @Override
    public void endPlay() {
        System.out.println("Football-endPlay");
    }
}
