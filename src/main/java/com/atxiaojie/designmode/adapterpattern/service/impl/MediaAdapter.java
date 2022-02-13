package com.atxiaojie.designmode.adapterpattern.service.impl;

import com.atxiaojie.designmode.adapterpattern.service.AdvancedMediaPlayer;
import com.atxiaojie.designmode.adapterpattern.service.MediaPlayer;

/**
 * @ClassName: MediaAdapter
 * @Description: 播放器适配器
 * @author: zhouxiaojie
 * @date: 2021/11/28 11:20
 * @Version: V1.0.0
 */
public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("vlc") ){
            advancedMusicPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMusicPlayer.playVlc(fileName);
        }else if(audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer.playMp4(fileName);
        }
    }
}
