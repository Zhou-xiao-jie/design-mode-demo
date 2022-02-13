package com.atxiaojie.designmode.singletonpattern;

/**
 * @ClassName: SingleObject
 * @Description: SingleObject 类有它的私有构造函数和本身的一个静态实例。
 * SingleObject 类提供了一个静态方法，供外界获取它的静态实例
 * @author: zhouxiaojie
 * @date: 2021/11/27 17:02
 * @Version: V1.0.0
 */
public class SingleObject {

    //创建 SingleObject 的一个对象
    private static SingleObject instance = new SingleObject();

    //让构造函数为 private，这样该类就不会被实例化
    private SingleObject(){}

    //获取唯一可用的对象
    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}
