package cn.itcast.day11.demo06;

public class DemoMain {

    public static void main(String[] args) {
        // 创建一个英雄角色
        Hero hero = new Hero();
        // 为英雄起一个名字，并设置年龄
        hero.setName("诺克萨斯之手");
        hero.setAge(20);


        // 创建一个武器对象
        Weapon weapon = new Weapon("黑色切割者");
        // 为英雄配备武器
        hero.setWeapon(weapon);

        // 年龄为20的诺克萨斯之手正在用黑色切割者暴扣胡乃骚
        hero.attack();
    }
}
