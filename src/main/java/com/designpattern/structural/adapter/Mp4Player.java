package com.designpattern.structural.adapter;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/13 16:44
 * @Description:
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        return;
    }

    @Override
    public void playMp4(String fileName) {
        System.out.printf("playMp4-%s\n", fileName);
    }
}
