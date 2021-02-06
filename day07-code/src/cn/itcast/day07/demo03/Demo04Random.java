package cn.itcast.day07.demo03;

import java.util.Random;

public class Demo04Random {
    public static void main(String[] args) {
        Random r = new Random();
        int x = 5;
        while (true){
            int n = r.nextInt(x) + 1;
            System.out.println("无限输出的随机数字是：" + n);
        }
    }
}
