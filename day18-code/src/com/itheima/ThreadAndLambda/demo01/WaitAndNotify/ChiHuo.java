package com.itheima.ThreadAndLambda.demo01.WaitAndNotify;
/*
    消费(吃货)类：是一个线程类，可以继承Thread
    设置线程任务(run)：吃包子
    对包子状态进行判断
    false：没有包子
        吃货调用wait方法进行等待状态
    true：有包子
        吃货吃包子
        吃货吃完包子
        修改包子的状态为false没有
        吃货唤醒包子铺状态，生产包子
 */
public class ChiHuo extends Thread {
    // 1. 需要再成员位置创建一个包子变量
    private Baozi bz;

    // 2. 使用带参数构造方法，为这个包子变量赋值
    public ChiHuo(Baozi bz) {
        this.bz = bz;
    }

    // 设置线程任务(run)：吃包子
    @Override
    public void run() {
        // 使用死循环，让吃货一直吃包子
        while (true) {
            // 必须同时同步技术保证两个线程只能有一个再执行
            synchronized (bz) {
                // 对包子的状态进行判断
                if (bz.flag == false) {
                    // 包子铺调用wait方法进行等待状态
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // 被唤醒之后执行，吃包子
                System.out.println("吃货正在吃：" + bz.pi + bz.xian + "的包子");
                // 吃货吃完包子
                // 修改包子的状态为false没有
                bz.flag = false;
                // 吃货唤醒包子铺状态，生产包子
                bz.notify();
                System.out.println("吃货已经把：" + bz.pi + bz.xian + "的包子吃完了，包子铺开始生产包子");
                System.out.println("------------------------------------------------------------");

            }
        }
    }
}
