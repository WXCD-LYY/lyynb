package cn.itcast.day10.demo05;

public class Zi extends Fu {

    int num = 20;

    int age = 16;

    @Override // 覆盖重写
    public void showNum() {
        System.out.println(num);
    }
    @Override // 覆盖重写
    public  void method(){
        System.out.println("子类方法");
    }

    public void methodZi(){
        System.out.println("子类特有方法");
    }
}
