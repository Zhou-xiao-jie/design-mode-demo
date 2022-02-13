package com.atxiaojie.designmode.adapterpattern.service.impl;

import com.atxiaojie.designmode.adapterpattern.service.AdvancedMediaPlayer;

/**
 * @ClassName: VlcPlayer
 * @Description: vlc播放器
 * @author: zhouxiaojie
 * @date: 2021/11/28 11:19
 * @Version: V1.0.0
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //什么也不做
    }
}
