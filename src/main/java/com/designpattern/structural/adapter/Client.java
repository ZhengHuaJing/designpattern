package com.designpattern.structural.adapter;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/13 16:43
 * @Description: 适配器模式测试
 */
public class Client {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp4", "1.mp4");
        audioPlayer.play("mp3", "2.mp3");
        audioPlayer.play("vlc", "3.vlc");
        audioPlayer.play("vlc2", "4.vlc");
    }
}
