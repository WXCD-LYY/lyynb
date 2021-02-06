package com.itheima.Thread.demo04.Runnable;
// 1. 创建一个Runnable接口的实现类
public class RunnableImpl2 implements Runnable{
    // 2. 再实现类中重写Runnable接口的run方法，试着线程任务
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("HelloWorld" + i);
        }
    }
}
