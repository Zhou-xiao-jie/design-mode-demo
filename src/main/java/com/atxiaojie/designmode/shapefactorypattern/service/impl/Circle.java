package com.atxiaojie.designmode.shapefactorypattern.service.impl;

import com.atxiaojie.designmode.shapefactorypattern.service.Shape;

/**
 * @ClassName: Circle
 * @Description: 圆
 * @author: zhouxiaojie
 * @date: 2021/11/27 16:15
 * @Version: V1.0.0
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
