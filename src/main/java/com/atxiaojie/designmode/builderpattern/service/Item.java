package com.atxiaojie.designmode.builderpattern.service;

/**
 * @ClassName: Item
 * @Description: 创建一个表示食物条目的接口，名称、包装、价格。
 * @author: zhouxiaojie
 * @date: 2021/11/27 16:12
 * @Version: V1.0.0
 */
public interface Item {
    public String name();
    public Packing packing();
    public float price();
}
