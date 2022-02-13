package com.atxiaojie.designmode.prototypepattern;

/**
 * @ClassName: Rectangle
 * @Description: 创建抽象类的实体类Rectangle
 * @author: zhouxiaojie
 * @date: 2021/11/28 10:32
 * @Version: V1.0.0
 */
public class Rectangle extends Shape{
    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
