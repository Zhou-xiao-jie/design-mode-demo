package com.atxiaojie.designmode.volatiletest;

/**
 * @ClassName: volte
 * @Description:
 * 学习volatile：
 * 1.保证内存可见性,保证了每次读写变量都从主内存中读；  volatile可见性是通过汇编加上Lock前缀指令，触发底层的MESI缓存一致性协议来实现的
 * 2.禁止指令重排序 volatile有序性是通过内存屏障实现的
 * JVM内存屏障插入策略：
 * 每个volatile写操作的前面插入一个StoreStore屏障；
 * 在每个volatile写操作的后面插入一个StoreLoad屏障；
 * 在每个volatile读操作的后面插入一个LoadLoad屏障；
 * 在每个volatile读操作的后面插入一个LoadStore屏障。
 * 3.不保证原子性
 * @author: zhouxiaojie
 * @date: 2021/11/27 19:22
 * @Version: V1.0.0
 */
public class VolatileTest extends Thread {
    volatile boolean flag = false;
    int i = 0;

    @Override
    public void run() {
        while (!flag) {
            i++;
        }
    }

    public static void main(String[] args) throws Exception {
        VolatileTest vt = new VolatileTest();
        vt.start();
        Thread.sleep(2000);
        vt.flag = true;
        System.out.println("stope" + vt.i);
    }
}
