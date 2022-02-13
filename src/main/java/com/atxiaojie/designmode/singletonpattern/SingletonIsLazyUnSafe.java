package com.atxiaojie.designmode.singletonpattern;

/**
 * @ClassName: Singleton
 * @Description: 懒汉式，线程不安全
 * 是否 Lazy 初始化：是
 * 是否多线程安全：否
 * 实现难度：易
 * 描述：这种方式是最基本的实现方式，这种实现最大的问题就是不支持多线程。因为没有加锁 synchronized，所以严格意义上它并不算单例模式。
 * 这种方式 lazy loading 很明显，不要求线程安全，在多线程不能正常工作。
 * @author: zhouxiaojie
 * @date: 2021/11/27 17:05
 * @Version: V1.0.0
 */
public class SingletonIsLazyUnSafe {
    private static SingletonIsLazyUnSafe instance;
    private SingletonIsLazyUnSafe(){}

    public static SingletonIsLazyUnSafe getInstance() {
        if (instance == null) {
            instance = new SingletonIsLazyUnSafe();
        }
        return instance;
    }

    public void showMessage(){
        System.out.println("SingletonIsLazyUnSafe Hello World!");
    }

}
