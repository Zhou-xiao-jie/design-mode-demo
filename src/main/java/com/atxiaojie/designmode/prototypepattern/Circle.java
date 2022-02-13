package com.atxiaojie.designmode.prototypepattern;

/**
 * @ClassName: Circle
 * @Description: 创建抽象类的实体类Circle
 * @author: zhouxiaojie
 * @date: 2021/11/28 10:35
 * @Version: V1.0.0
 */
public class Circle extends Shape {
    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
