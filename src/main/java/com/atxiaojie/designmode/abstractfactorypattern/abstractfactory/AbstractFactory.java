package com.atxiaojie.designmode.abstractfactorypattern.abstractfactory;

import com.atxiaojie.designmode.colorfactorypattern.service.Color;
import com.atxiaojie.designmode.shapefactorypattern.service.Shape;

/**
 * @ClassName: AbstractFactory
 * @Description: 抽象工厂
 * @author: zhouxiaojie
 * @date: 2021/11/27 16:39
 * @Version: V1.0.0
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
