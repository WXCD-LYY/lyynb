package cn.itcast.day04.demo01;

public class MyPractice {
    public static void main(String[] args) {
        for (int hour = 0; hour <= 24 ; hour++){
            for (int minute = 0; minute < 60; minute++){
                for (int s = 0; s < 60; s++) {

                        System.out.println(hour + "点" +  minute + "分"+ s + "秒"  );


                    
                }
                        
            } 
        }
    }
}
