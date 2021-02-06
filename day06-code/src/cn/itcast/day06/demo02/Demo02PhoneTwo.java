package cn.itcast.day06.demo02;

public class Demo02PhoneTwo {
    public static void main(String[] args) {

        // 根据Phone类，创建一个名为one的对象
        // 格式：类名称 对象名称 = new 类名称();
        Phone two = new Phone();
        System.out.println(two.brand); // null
        System.out.println(two.color); // 0.0
        System.out.println(two.price); // null
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

        System.out.println("看注意事项");
    }
}
