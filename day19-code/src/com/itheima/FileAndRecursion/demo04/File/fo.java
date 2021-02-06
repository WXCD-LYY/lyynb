package com.itheima.FileAndRecursion.demo04.File;

import java.io.File;

public class fo {
    public static void main(String[] args) {
        File file = new File("D:\\WorkSoftWare\\JavaProject\\day19-code\\img");
        File[] list = file.listFiles();

        // 如果目录下文件存在
        if (file.exists() && file.isDirectory()) {
            for (int i = 0; i < list.length; i++) {
                //取文件名子存入name中
                String name = list[i].getName();
                // 截取.之前的字符串出来
                int index = name.indexOf(".");
                int index2 = name.lastIndexOf(".");
                String name3 = name.substring(index);
                // 拼接字符串
                String newName = "傻逼康健" + (i + 1) + name3;
                //重命名
                File dest = new File("D:\\WorkSoftWare\\JavaProject\\day19-code\\img\\修改之后" + "/" + newName);
                list[i].renameTo(dest);
                System.out.println(dest.getName());
            }
        }
    }
}
