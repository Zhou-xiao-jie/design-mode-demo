package com.atxiaojie.designmode.abstractfactorypattern.abstractfactory;

import com.atxiaojie.designmode.colorfactorypattern.factory.ColorFactory;
import com.atxiaojie.designmode.shapefactorypattern.factory.ShapeFactory;

/**
 * @ClassName: FactoryProducer
 * @Description: 创建一个工厂创造器/生成器类，通过传递形状或颜色信息来获取工厂
 * @author: zhouxiaojie
 * @date: 2021/11/27 16:42
 * @Version: V1.0.0
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        }else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}
