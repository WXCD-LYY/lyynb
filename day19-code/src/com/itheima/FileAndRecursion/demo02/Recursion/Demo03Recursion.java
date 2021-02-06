package com.itheima.FileAndRecursion.demo02.Recursion;
/*
    练习：
        使用递归计算阶乘
        n的阶乘：n! = n * (n‐1) *...* 3 * 2 * 1
        5的结成：5! = 5 * (5-1) *...* (5-4)
 */
public class Demo03Recursion {
    public static void main(String[] args) {
        int jiecheng = jc(5);
        System.out.println(jiecheng);
    }
    /*
        定义方法使用递归计算阶乘
        5的结成：5! = 5 * (5-1) *...* (5-4)
        递归结束的条件
            获取到1的时候结束
        递归的目的
            获取下一个被乘的数字(n-1)
        方法的的参数发生变化
     */

    public static int jc(int n) {
        // 获取到1的时候结束
        if (n == 1) {
            return 1;
        }
        // 获取下一个被乘的数字(n-1)
        return n * jc(n-1);
    }
}
