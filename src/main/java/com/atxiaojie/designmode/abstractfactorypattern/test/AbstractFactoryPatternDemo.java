package com.atxiaojie.designmode.abstractfactorypattern.test;

import com.atxiaojie.designmode.abstractfactorypattern.abstractfactory.AbstractFactory;
import com.atxiaojie.designmode.abstractfactorypattern.abstractfactory.FactoryProducer;
import com.atxiaojie.designmode.colorfactorypattern.service.Color;
import com.atxiaojie.designmode.shapefactorypattern.service.Shape;

/**
 * @ClassName: AbstractFactoryPatternDemo
 * @Description: 使用 FactoryProducer 来获取 AbstractFactory，通过传递类型信息来获取实体类的对象（抽象工厂模式）
 * @author: zhouxiaojie
 * @date: 2021/11/27 16:45
 * @Version: V1.0.0
 */
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory color = FactoryProducer.getFactory("color");
        if(color != null){
            Color red = color.getColor("red");
            red.fill();
        }
        AbstractFactory shape = FactoryProducer.getFactory("shape");
        if(shape != null){
            Shape circle = shape.getShape("Circle");
            circle.draw();
        }
    }
}
