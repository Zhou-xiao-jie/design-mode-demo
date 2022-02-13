package com.atxiaojie.designmode.builderpattern.service.impl;

/**
 * @ClassName: ChickenBurger
 * @Description: 创建扩展了 Burger 的实体类,鸡肉汉堡
 * @author: zhouxiaojie
 * @date: 2021/11/28 9:48
 * @Version: V1.0.0
 */
public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
