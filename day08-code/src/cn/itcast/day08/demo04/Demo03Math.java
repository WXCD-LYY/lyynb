package cn.itcast.day08.demo04;
/*
java.util.Math类是数学相关的工具类，里面提供了大量的静态方法，完成与数学运算相关的操作。

public static double abs(double num): 获取绝对值。有多种重载
public static double ceil(double num): 向上取整。
public static double floor(double num): 向下取整。
public static long round(double num): 四舍五入,不带小数点。

Math.PI代表近似的圆周率常量(double)。

 */
public class Demo03Math {
    public static void main(String[] args) {
        // 获取绝对值
        System.out.println(Math.abs(0.2));
        System.out.println(Math.abs(0));
        System.out.println(Math.abs(-2.5));
        System.out.println("=====================");


        // 向上取模
        System.out.println(Math.ceil(3.9)); // 3.9
        System.out.println(Math.ceil(3.1)); // 3.1
        System.out.println(Math.ceil(3.0)); // 3.0
        System.out.println("=====================");


        // 向下取整，抹零
        System.out.println(Math.floor(3.69)); //3.0
        System.out.println(Math.floor(30.69)); // 30.0
        System.out.println(Math.floor(31.0)); // 31.0
        System.out.println("=====================");


        System.out.println(Math.round(20.4)); // 20
        System.out.println(Math.round(10.5)); // 11
    }
}
