package cn.itcast.day08.demo01;
/*
字符串常量池：程序当中直接协商的双引号字符串，就在字符串常量池中。

对于基本类型来说，==时进行数值比较。
对于引用类型来说，==时进行【地址值】的比较。

注意：
1.对于基本类型来说，==时进行数值比较。
2.双引号直接写的字符串在常量池当中，new的不在常量池当中。
 */
public class Demo02StringPoo {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";

        char[] charArray = {'a', 'b', 'c'};
        String str3 = new String(charArray);

        System.out.println(str1==str2); // true
        System.out.println(str1==str3); // false
        System.out.println(str2==str3); // false
    }
}
