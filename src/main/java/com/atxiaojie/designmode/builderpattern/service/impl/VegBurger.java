package com.atxiaojie.designmode.builderpattern.service.impl;

/**
 * @ClassName: VegBurger
 * @Description: 创建扩展了 Burger 的实体类,素食汉堡
 * @author: zhouxiaojie
 * @date: 2021/11/28 9:46
 * @Version: V1.0.0
 */
public class VegBurger extends Burger {

    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}
