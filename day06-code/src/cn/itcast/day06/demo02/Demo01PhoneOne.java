package cn.itcast.day06.demo02;
/*
注意事项：
    面向对象的第七个视频，画图重点理解
 */
import java.sql.SQLOutput;

public class Demo01PhoneOne {
    public static void main(String[] args) {

        // 根据Phone类，创建一个名为one的对象
        // 格式：类名称 对象名称 = new 类名称();
        Phone one = new Phone();
        System.out.println(one.brand); // null
        System.out.println(one.color); // 0.0
        System.out.println(one.price); // null
        System.out.println("========================");

        one.brand = "魅族";
        one.color = "黑色";
        one.price = 2800.0;

        System.out.println(one.brand); // 苹果
        System.out.println(one.color); // 黑色
        System.out.println(one.price); // 2800.0
        System.out.println("=========================");

        one.call("李军");
        one.sendMessage();

        System.out.println("看注意事项");
    }
}
