package com.atxiaojie.designmode.prototypepattern;

/**
 * @ClassName: Square
 * @Description: 创建抽象类的实体类Square
 * @author: zhouxiaojie
 * @date: 2021/11/28 10:34
 * @Version: V1.0.0
 */
public class Square extends Shape {
    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
