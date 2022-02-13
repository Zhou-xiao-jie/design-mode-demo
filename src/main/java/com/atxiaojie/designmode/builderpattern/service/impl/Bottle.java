package com.atxiaojie.designmode.builderpattern.service.impl;

import com.atxiaojie.designmode.builderpattern.service.Packing;

/**
 * @ClassName: Bottle
 * @Description: 创建实现 Packing 接口的实体类,饮料瓶子
 * @author: zhouxiaojie
 * @date: 2021/11/28 9:39
 * @Version: V1.0.0
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
