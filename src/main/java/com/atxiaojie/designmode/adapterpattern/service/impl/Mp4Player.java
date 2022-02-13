package com.atxiaojie.designmode.adapterpattern.service.impl;

import com.atxiaojie.designmode.adapterpattern.service.AdvancedMediaPlayer;

/**
 * @ClassName: Mp4Player
 * @Description: MP4播放器
 * @author: zhouxiaojie
 * @date: 2021/11/28 11:19
 * @Version: V1.0.0
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        //什么也不做
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
