package com.atxiaojie.designmode.builderpattern.service.impl;

import com.atxiaojie.designmode.builderpattern.service.Item;
import com.atxiaojie.designmode.builderpattern.service.Packing;

/**
 * @ClassName: ColdDrink
 * @Description: 创建实现 Item 接口的抽象类,饮料
 * @author: zhouxiaojie
 * @date: 2021/11/28 9:44
 * @Version: V1.0.0
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
