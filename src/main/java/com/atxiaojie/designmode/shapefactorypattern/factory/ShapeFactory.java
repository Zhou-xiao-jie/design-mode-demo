package com.atxiaojie.designmode.shapefactorypattern.factory;

import com.atxiaojie.designmode.abstractfactorypattern.abstractfactory.AbstractFactory;
import com.atxiaojie.designmode.colorfactorypattern.service.Color;
import com.atxiaojie.designmode.shapefactorypattern.service.Shape;
import com.atxiaojie.designmode.shapefactorypattern.service.impl.Circle;
import com.atxiaojie.designmode.shapefactorypattern.service.impl.Rectangle;
import com.atxiaojie.designmode.shapefactorypattern.service.impl.Square;

/**
 * @ClassName: ShapeFactory
 * @Description: 形状工厂
 * @author: zhouxiaojie
 * @date: 2021/11/27 16:16
 * @Version: V1.0.0
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) {
        return null;
    }

    //使用 getShape 方法获取形状类型的对象
    @Override
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
