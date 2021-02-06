package cn.itcast.day05.demo03;

import java.sql.SQLOutput;

/*
如何获取数组的长度，格式：
数组名称.Length

这会得到一个int数字，代表数数组的长度。

数组一旦创建，程序运行期间，长度不可改变。
 */
public class Demo03ArrayLength {
    public static void main(String[] args) {
//        int[] arrayA = new int[3];
//
//        int[] arrayB = {1, 2, 3};
//        int len = arrayB.length;
//        System.out.println("arrayB数组的长度是：" + len );
//        System.out.println("=============");
//
//        int[] arrayC = new int[3];
//        System.out.println(arrayC.length); // 3
//        arrayC = new int[5];
//        System.out.println(arrayC.length); // 5


        int[] a = new int[]{1,1,1,1,1,11,1,1,1,1,1,11,1,};
        int b = a.length;
        System.out.println(b);
    }
}
