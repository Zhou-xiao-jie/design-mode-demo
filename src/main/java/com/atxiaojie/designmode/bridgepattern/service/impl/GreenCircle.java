package com.atxiaojie.designmode.bridgepattern.service.impl;

import com.atxiaojie.designmode.bridgepattern.service.DrawAPI;

/**
 * @ClassName: GreenCircle
 * @Description: 创建实现了 DrawAPI 接口的实体桥接实现类，实现画圆接口为绿色的圆类
 * @author: zhouxiaojie
 * @date: 2021/11/28 13:28
 * @Version: V1.0.0
 */
public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
