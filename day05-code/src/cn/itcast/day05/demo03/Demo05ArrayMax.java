package cn.itcast.day05.demo03;

public class Demo05ArrayMax {
    public static void main(String[] args) {


        int[] array = {5, 15, 30, 20, 10000, -20, 30, 35};
        int min = array[0]; // 比武擂台
        for (int i = 0; i < array.length; i++) {
            // 如果当前元素，比min更小，则换之
            if (array[i] < min ){
            min = array[i];
            }
        }
        // 谁最后最厉害，就能在max当中留下谁的战斗力
        System.out.println("最大值：" + min);
    }
}
