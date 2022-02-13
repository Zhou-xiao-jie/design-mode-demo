package com.atxiaojie.designmode.bridgepattern.service.impl;

import com.atxiaojie.designmode.bridgepattern.service.DrawAPI;

/**
 * @ClassName: Circle
 * @Description: 创建实现了 Shape 抽象类的实体类 圆
 * @author: zhouxiaojie
 * @date: 2021/11/28 13:31
 * @Version: V1.0.0
 */
public class Circle extends Shape{
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawapi) {
        super(drawapi);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius,x,y);
    }
}
