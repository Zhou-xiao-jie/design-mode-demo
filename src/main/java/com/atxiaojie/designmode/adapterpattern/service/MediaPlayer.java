package com.atxiaojie.designmode.adapterpattern.service;

/**
 * @ClassName: MediaPlayer
 * @Description: 媒体播放器接口
 * @author: zhouxiaojie
 * @date: 2021/11/28 11:19
 * @Version: V1.0.0
 */
public interface MediaPlayer {
    public void play(String audioType, String fileName);
}