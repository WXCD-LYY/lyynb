package cn.itcast.day07.demo01;

import java.util.Scanner;

/*
键盘输入两个int数字，并且求出和值

思路：
1.既然需要及那盘输入，那么就用Scanner
2.Scanner的三个步骤：导包、创建、使用
3.需要两个数字，所以要调用两次nextInt方法
4.得到了两个个数字，就需要加在一起
5.讲将结果打印输出1
 */
public class Demo02ScannerSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int a = sc.nextInt();
        System.out.println("请输入第二个位数字：");
        int b = sc.nextInt();
        int result = a + b ;
        System.out.println("结果是：" + result);
    }
}
