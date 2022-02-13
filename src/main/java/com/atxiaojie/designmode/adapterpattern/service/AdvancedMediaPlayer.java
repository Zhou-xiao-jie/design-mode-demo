package com.atxiaojie.designmode.adapterpattern.service;

/**
 * @ClassName: AdvancedMediaPlayer
 * @Description: 更高级的媒体播放器接口
 * @author: zhouxiaojie
 * @date: 2021/11/28 11:19
 * @Version: V1.0.0
 */
public interface AdvancedMediaPlayer {
    public void playVlc(String fileName);
    public void playMp4(String fileName);
}
