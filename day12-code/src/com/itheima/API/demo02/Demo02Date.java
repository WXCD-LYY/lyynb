package com.itheima.API.demo02;

import java.util.Date;

public class Demo02Date {
    public static void main(String[] args) {
        demo03();
    }
    /*
        Long getTime() 把日期转换为毫秒值(相当于System.currentTimeMillis())
            返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Date 对象表示的毫秒数。
     */
    private static void demo03() {
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time); // 1574775886267
    }

    /*
        Date类的带参数的构造方法
        Date(Long date) : 传递毫秒值，把毫秒值转换为Date日期
    */
    private static void demo02() {
        Date date = new Date(0L);
        System.out.println(date); // Thu Jan 01 08:00:00 GMT+08:00 1970

        date = new Date(1574773952437L);
        System.out.println(date); // Tue Nov 26 21:12:32 GMT+08:00 2019

    }

    /*
        Date类的空参数构造方法
        Date() 获取当前系统的日期和时间

    */
    private static void demo01() {
        Date date = new Date();
        System.out.println(date); // Tue Nov 26 21:20:14 GMT+08:00 2019

    }


}
