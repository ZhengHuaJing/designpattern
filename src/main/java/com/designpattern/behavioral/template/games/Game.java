package com.designpattern.behavioral.template.games;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/14 16:50
 * @Description:
 */
public abstract class Game {
    public abstract void initialize();

    public abstract void startPlay();

    public abstract void endPlay();

    public final void play() {
        initialize();
        startPlay();
        endPlay();
    }
}
