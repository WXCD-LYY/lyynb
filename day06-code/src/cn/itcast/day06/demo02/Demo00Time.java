package cn.itcast.day06.demo02;

public class Demo00Time {
    public static void main(String[] args) {
        for (int i = 0; i < 24; i++) {
            for (int i1 = 0; i1 < 60; i1++) {
                for (int i2 = 0; i2 < 60; i2++) {
                    System.out.println(i + "时" + i1 + "分" + i2 + "秒");
                }

            }
        }
//        System.out.println(i + "时" + i1 + "分" + i2 + "秒");
    }
}
