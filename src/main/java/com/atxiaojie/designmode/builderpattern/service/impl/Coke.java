package com.atxiaojie.designmode.builderpattern.service.impl;

/**
 * @ClassName: Coke
 * @Description: 创建扩展了 ColdDrink 的实体类，可口可乐。
 * @author: zhouxiaojie
 * @date: 2021/11/28 9:54
 * @Version: V1.0.0
 */
public class Coke extends ColdDrink{
    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
