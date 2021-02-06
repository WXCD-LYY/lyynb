package com.itheima.ThreadAndLambda.demo02.ThreadPool;
/*
    2.创建一个类，实现Runnable接口，重写run方法，设置线程池任务
 */
public class RunnableImpl implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "创建了一个新的线程");
    }
}
