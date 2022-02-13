package com.atxiaojie.designmode.colorfactorypattern.service.impl;

import com.atxiaojie.designmode.colorfactorypattern.service.Color;

/**
 * @ClassName: Red
 * @Description: 红色
 * @author: zhouxiaojie
 * @date: 2021/11/27 16:31
 * @Version: V1.0.0
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
