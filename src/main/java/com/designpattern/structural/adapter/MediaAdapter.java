package com.designpattern.structural.adapter;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/13 16:42
 * @Description:
 */
public class MediaAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter() {
    }

    @Override
    public void play(String audioType, String fileName) {
        switch (audioType) {
            case "mp4":
                advancedMediaPlayer = new Mp4Player();
                advancedMediaPlayer.playMp4(fileName);
                break;
            case "vlc":
                advancedMediaPlayer = new VlcPlayer();
                advancedMediaPlayer.playVlc(fileName);
                break;
            default:
                System.out.println("无法播放此格式文件");
        }
    }
}
