package com.atxiaojie.designmode.builderpattern.service.impl;

/**
 * @ClassName: Pepsi
 * @Description: 创建扩展了 ColdDrink 的实体类，百事可乐。
 * @author: zhouxiaojie
 * @date: 2021/11/28 9:56
 * @Version: V1.0.0
 */
public class Pepsi extends ColdDrink{
    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}
