package com.atxiaojie.designmode.builderpattern.service.impl;

import com.atxiaojie.designmode.builderpattern.service.Item;
import com.atxiaojie.designmode.builderpattern.service.Packing;

/**
 * @ClassName: Burger
 * @Description: 创建实现 Item 接口的抽象类,汉堡包
 * @author: zhouxiaojie
 * @date: 2021/11/28 9:41
 * @Version: V1.0.0
 */
public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
