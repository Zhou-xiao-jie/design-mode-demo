package com.atxiaojie.designmode.bridgepattern.service.impl;

import com.atxiaojie.designmode.bridgepattern.service.DrawAPI;

/**
 * @ClassName: Shape
 * @Description: 使用 DrawAPI 接口创建抽象类 Shape
 * @author: zhouxiaojie
 * @date: 2021/11/28 13:30
 * @Version: V1.0.0
 */
public abstract class Shape {
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
