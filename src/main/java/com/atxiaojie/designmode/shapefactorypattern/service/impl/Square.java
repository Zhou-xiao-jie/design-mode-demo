package com.atxiaojie.designmode.shapefactorypattern.service.impl;

import com.atxiaojie.designmode.shapefactorypattern.service.Shape;

/**
 * @ClassName: Square
 * @Description: 正方形
 * @author: zhouxiaojie
 * @date: 2021/11/27 16:14
 * @Version: V1.0.0
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
