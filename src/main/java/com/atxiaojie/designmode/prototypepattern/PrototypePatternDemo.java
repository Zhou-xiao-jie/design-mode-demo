package com.atxiaojie.designmode.prototypepattern;

/**
 * @ClassName: PrototypePatternDemo
 * @Description: PrototypePatternDemo 使用 ShapeCache 类来获取存储在 Hashtable 中的形状的克隆，测试原型模式
 * @author: zhouxiaojie
 * @date: 2021/11/28 10:38
 * @Version: V1.0.0
 */
public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println(clonedShape);
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println(clonedShape2);
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println(clonedShape3);
        System.out.println("Shape : " + clonedShape3.getType());
    }
}
