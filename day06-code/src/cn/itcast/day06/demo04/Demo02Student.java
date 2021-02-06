package cn.itcast.day06.demo04;

public class Demo02Student {
    public static void main(String[] args) {
        Student stu1 = new Student(); // 无参构造
        System.out.println("=======================");
        Student stu2 = new Student("李洋泳",20); // 全参构造
        System.out.println("姓名：" + stu2.getName() + ", 年龄：" + stu2.getAge());
        // 如果需要改变对象中的成员变量数据表内容，仍然需要使用setXxx方法
        stu2.setAge(23); // 改变年龄
        System.out.println("姓名：" + stu2.getName() + ", 年龄：" + stu2.getAge());

    }
}
