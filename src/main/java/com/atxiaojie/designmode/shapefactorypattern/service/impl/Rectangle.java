package com.atxiaojie.designmode.shapefactorypattern.service.impl;

import com.atxiaojie.designmode.shapefactorypattern.service.Shape;

/**
 * @ClassName: Rectangle
 * @Description: 长方形
 * @author: zhouxiaojie
 * @date: 2021/11/27 16:12
 * @Version: V1.0.0
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
