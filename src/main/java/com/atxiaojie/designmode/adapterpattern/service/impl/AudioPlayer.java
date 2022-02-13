package com.atxiaojie.designmode.adapterpattern.service.impl;

import com.atxiaojie.designmode.adapterpattern.service.MediaPlayer;

/**
 * @ClassName: AudioPlayer
 * @Description: TODO
 * @author: zhouxiaojie
 * @date: 2021/11/28 13:16
 * @Version: V1.0.0
 */
public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        //播放 mp3 音乐文件的内置支持
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file. Name: "+ fileName);
        } else if(audioType.equalsIgnoreCase("vlc")
                || audioType.equalsIgnoreCase("mp4")){
            //mediaAdapter 提供了播放其他文件格式的支持
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }
        else{
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}
