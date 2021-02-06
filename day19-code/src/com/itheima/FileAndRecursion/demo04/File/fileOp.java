package com.itheima.FileAndRecursion.demo04.File;

import java.io.File;

public class fileOp {
    public static void main(String[] args) {
        File file = new File("D:\\WorkSoftWare\\JavaProject\\day19-code\\img");
        File[] list = file.listFiles();
// 如果目录下文件存在
        if (file.exists() && file.isDirectory()) {
            for (int i = 0; i < list.length; i++) {
//取文件名子存入name中
                String name = list[i].getName();
// 截取"]"之前的字符串出来
                int index = name.indexOf("]");
                String name2 = name.substring(index + 1);
//重命名并存入d:/photos
                File dest = new File("D:\\WorkSoftWare\\JavaProject\\day19-code\\img\\新建文件夹" + "222" + name2);
                list[i].renameTo(dest);
                System.out.println(dest.getName());
            }
        }
    }
}
