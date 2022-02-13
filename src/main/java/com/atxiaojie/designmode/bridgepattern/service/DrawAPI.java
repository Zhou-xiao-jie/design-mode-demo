package com.atxiaojie.designmode.bridgepattern.service;

/**
 * @ClassName: DrawAPI
 * @Description: 创建桥接实现接口,画圆接口
 * @author: zhouxiaojie
 * @date: 2021/11/28 13:26
 * @Version: V1.0.0
 */
public interface DrawAPI {
    public void drawCircle(int radius, int x, int y);
}
