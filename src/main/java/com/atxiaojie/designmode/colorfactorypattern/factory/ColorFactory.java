package com.atxiaojie.designmode.colorfactorypattern.factory;

import com.atxiaojie.designmode.abstractfactorypattern.abstractfactory.AbstractFactory;
import com.atxiaojie.designmode.colorfactorypattern.service.Color;
import com.atxiaojie.designmode.colorfactorypattern.service.impl.Blue;
import com.atxiaojie.designmode.colorfactorypattern.service.impl.Green;
import com.atxiaojie.designmode.colorfactorypattern.service.impl.Red;
import com.atxiaojie.designmode.shapefactorypattern.service.Shape;

/**
 * @ClassName: ColorFactory
 * @Description: 颜色工厂
 * @author: zhouxiaojie
 * @date: 2021/11/27 16:35
 * @Version: V1.0.0
 */
public class ColorFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
