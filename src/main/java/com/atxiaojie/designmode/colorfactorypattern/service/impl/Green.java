package com.atxiaojie.designmode.colorfactorypattern.service.impl;

import com.atxiaojie.designmode.colorfactorypattern.service.Color;

/**
 * @ClassName: Green
 * @Description: 绿色
 * @author: zhouxiaojie
 * @date: 2021/11/27 16:33
 * @Version: V1.0.0
 */
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
