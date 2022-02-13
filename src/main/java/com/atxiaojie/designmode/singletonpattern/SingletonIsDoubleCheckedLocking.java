package com.atxiaojie.designmode.singletonpattern;

/**
 * @ClassName: SingletonIsDoubleCheckedLocking
 * @Description: 双检锁/双重校验锁（DCL，即 double-checked locking）
 * JDK 版本：JDK1.5 起
 * 是否 Lazy 初始化：是
 * 是否多线程安全：是
 * 实现难度：较复杂
 * 描述：这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 * getInstance() 的性能对应用程序很关键。
 * @author: zhouxiaojie
 * @date: 2021/11/27 17:16
 * @Version: V1.0.0
 */
public class SingletonIsDoubleCheckedLocking {
    //用volatile关键字修饰instance变量，使得instance在读、写操作前后都会插入内存屏障，避免重排序
    private volatile static SingletonIsDoubleCheckedLocking singleton;
    private SingletonIsDoubleCheckedLocking (){}

    public static SingletonIsDoubleCheckedLocking getInstance() {
        if (singleton == null) {
            synchronized (SingletonIsDoubleCheckedLocking.class) {
                if (singleton == null) {
                    singleton = new SingletonIsDoubleCheckedLocking();
                }
            }
        }
        return singleton;
    }

    public void showMessage(){
        System.out.println("SingletonIsDoubleCheckedLocking Hello World!");
    }
}
