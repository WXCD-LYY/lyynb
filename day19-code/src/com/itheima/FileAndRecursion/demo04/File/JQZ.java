package com.itheima.FileAndRecursion.demo04.File;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class JQZ {
    public static void main(String[] args)throws IOException {
        String fileStr="";
        String rStr="";
        String newStr="";
        try{
            System.out.print("\n输入文件夹路径：");
            Scanner fsc = new Scanner(System.in);
            fileStr = fsc.nextLine();
            System.out.print("\n输入被替换字符：");
            Scanner rsc = new Scanner(System.in);
            rStr = rsc.nextLine();
            System.out.print("\n输入替换字符：");
            Scanner newsc = new Scanner(System.in);
            newStr = newsc.nextLine();
        }catch(Exception e){
            System.out.println("Error: 001--"+e.getMessage());
        }
        RenameFile(fileStr,rStr,newStr);
    }
    public static boolean RenameFile(String filepath,String rStr,String newStr) throws IOException{
        try {
            File fileDir = new File(filepath);
            for (File file : fileDir.listFiles())
            {
                if(file.isFile()){
                    String fileName = file.getName();
                    String newName = fileName.replace(rStr,newStr);
                    File f_new = new File(filepath, newName);
                    file.renameTo(f_new);
                    System.out.println(filepath+"\\"+fileName+">>"+filepath+"\\"+newName+"-----"+f_new.exists());
                }
            }
        }catch(Exception e){
            System.out.println("错误信息: " + e.getMessage()+"   请确认文件夹是否处在！");
        }
        return true;
    }
}
