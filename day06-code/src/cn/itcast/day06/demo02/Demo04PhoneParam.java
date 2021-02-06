package cn.itcast.day06.demo02;

public class Demo04PhoneParam {
    public static void main(String[] args) {
        Phone one = new Phone();
        one.brand = "苹果";
        one.price = 2500.0;
        one.color = "黑色";

        method(one); // 传递进去的参数其实就是地址值


        System.out.println("======================");


//        Phone lyy = new Phone();
//        lyy.color = "白色";
//        lyy.price = 5000.0;
//        lyy.brand = "锤子";
//
//        practice(lyy);
    }

    public static void method(Phone param){
        System.out.println(param.brand);
        System.out.println(param.price);
        System.out.println(param.color);

    }

//    public static void practice(Phone lyy){
//        System.out.println(lyy.brand);
//        System.out.println(lyy.color);
//        System.out.println(lyy.price);
//
//    }
}
