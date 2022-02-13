package com.atxiaojie.designmode.colorfactorypattern.service.impl;

import com.atxiaojie.designmode.colorfactorypattern.service.Color;

/**
 * @ClassName: Blue
 * @Description: 蓝色
 * @author: zhouxiaojie
 * @date: 2021/11/27 16:34
 * @Version: V1.0.0
 */
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
