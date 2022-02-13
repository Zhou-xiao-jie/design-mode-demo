package com.atxiaojie.designmode.builderpattern.service.impl;

import com.atxiaojie.designmode.builderpattern.service.Packing;

/**
 * @ClassName: Wrapper
 * @Description: 创建实现 Packing 接口的实体类,汉堡纸包装
 * @author: zhouxiaojie
 * @date: 2021/11/28 9:37
 * @Version: V1.0.0
 */
public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}
