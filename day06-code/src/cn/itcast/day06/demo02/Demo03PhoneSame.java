package cn.itcast.day06.demo02;

public class Demo03PhoneSame {
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

        System.out.println(one.brand); // 魅族
        System.out.println(one.color); // 黑色
        System.out.println(one.price); // 2800.0
        System.out.println("=========================");

        one.call("李军");
        one.sendMessage();


        // 将onr房中保存的对象地址赋值给two
        Phone two = one;
        System.out.println(two.brand); // 魅族
        System.out.println(two.color); // 黑色
        System.out.println(two.price); // 2800.0
        System.out.println("========================");

        two.brand = "苹果";
        two.color = "白色";
        two.price = 4999.0;

        System.out.println(two.brand); // 苹果
        System.out.println(two.color); // 白色
        System.out.println(two.price); // 4999.0
        System.out.println("=========================");

        two.call("李洋泳");
        two.sendMessage();
    }
}