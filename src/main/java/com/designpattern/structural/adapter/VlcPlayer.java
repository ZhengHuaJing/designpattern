package com.designpattern.structural.adapter;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/13 16:44
 * @Description:
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.printf("playVlc-%s\n", fileName);
    }

    @Override
    public void playMp4(String fileName) {
        return;
    }
}
