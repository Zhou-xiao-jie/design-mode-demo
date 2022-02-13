package com.atxiaojie.designmode.singletonpattern;

/**
 * @ClassName: SingletonPatternDemo
 * @Description: 测试简单的单例模式
 * @author: zhouxiaojie
 * @date: 2021/11/27 17:04
 * @Version: V1.0.0
 */
public class SingletonPatternDemo {

    public static void main(String[] args) {

        //不合法的构造函数
        //编译时错误：构造函数 SingleObject() 是不可见的
        //SingleObject object = new SingleObject();

        //获取唯一可用的对象
        SingleObject object = SingleObject.getInstance();
        //1.懒汉式，线程不安全
        //SingletonIsLazyUnSafe instance = SingletonIsLazyUnSafe.getInstance();
        //2.懒汉式，线程安全
        //SingletonIsLazySafe instance = SingletonIsLazySafe.getInstance();
        //3.饿汉式
        //SingletonlsHungry instance = SingletonlsHungry.getInstance();
        //4.双检锁/双重校验锁（DCL，即 double-checked locking）
        //SingletonIsDoubleCheckedLocking instance = SingletonIsDoubleCheckedLocking.getInstance();
        //5.登记式/静态内部类
        //SingletonIsStaticInnerClass instance = SingletonIsStaticInnerClass.getInstance();
        //6.枚举
        SingletonISenumerate instance = SingletonISenumerate.INSTANCE;

        //显示消息
        instance.showMessage();
    }
}
