package com.designpattern.behavioral.template.games;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/14 16:51
 * @Description:
 */
public class Cricket extends Game {
    @Override
    public void initialize() {
        System.out.println("Cricket-initialize");
    }

    @Override
    public void startPlay() {
        System.out.println("Cricket-startPlay");
    }

    @Override
    public void endPlay() {
        System.out.println("Cricket-endPlay");
    }
}
