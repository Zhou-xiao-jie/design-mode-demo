package com.atxiaojie.designmode.adapterpattern.test;

import com.atxiaojie.designmode.adapterpattern.service.impl.AudioPlayer;

/**
 * @ClassName: AdapterPatternDemo
 * @Description: 使用 AudioPlayer 来播放不同类型的音频格式, 适配器模式
 * @author: zhouxiaojie
 * @date: 2021/11/28 13:18
 * @Version: V1.0.0
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}
