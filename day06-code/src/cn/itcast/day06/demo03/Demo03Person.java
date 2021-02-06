package cn.itcast.day06.demo03;

public class Demo03Person {
    public static void main(String[] args) {
        Person person = new Person();
        person.show();

        System.out.println("======================");

        person.name = "李洋泳";
//        person.age = 20; // 直接访问private内容，错误写法！
        person.setAge(-10);
        person.show();
    }
}
