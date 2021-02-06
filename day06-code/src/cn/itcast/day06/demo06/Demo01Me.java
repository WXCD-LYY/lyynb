package cn.itcast.day06.demo06;

public class Demo01Me {
    public static void main(String[] args) {
//        Me me = new Me("李洋泳",23);
        Me me = new Me();
        me.setName("李洋泳");
        me.setAge(23);
        System.out.println("姓名：" + me.getName() + ", 年龄：" + me.getAge());
        System.out.println("===================");
        me.setAge(22);
        System.out.println("姓名：" + me.getName() + ", 年龄：" + me.getAge());
    }
}
