package com.designpattern.structural.adapter;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/13 16:43
 * @Description:
 */
public class AudioPlayer implements MediaPlayer {

    private MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equals("mp3")) {
            System.out.println("mp3播放中...");
        } else {
            mediaAdapter = new MediaAdapter();
            mediaAdapter.play(audioType, fileName);
        }
    }
}
