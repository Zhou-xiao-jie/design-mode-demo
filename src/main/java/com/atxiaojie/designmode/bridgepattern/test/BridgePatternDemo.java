package com.atxiaojie.designmode.bridgepattern.test;

import com.atxiaojie.designmode.bridgepattern.service.impl.Circle;
import com.atxiaojie.designmode.bridgepattern.service.impl.GreenCircle;
import com.atxiaojie.designmode.bridgepattern.service.impl.RedCircle;
import com.atxiaojie.designmode.bridgepattern.service.impl.Shape;

/**
 * @ClassName: BridgePatternDemo
 * @Description: 使用 Shape 和 DrawAPI 类画出不同颜色的圆  桥接模式
 * @author: zhouxiaojie
 * @date: 2021/11/28 13:36
 * @Version: V1.0.0
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
