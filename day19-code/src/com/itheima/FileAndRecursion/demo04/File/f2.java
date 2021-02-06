package com.itheima.FileAndRecursion.demo04.File;

import java.io.*;
import java.util.*;
public class f2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("output1.txt"));
        List<String> newName = new ArrayList<String>();
        List<String> oldName = new ArrayList<String>();
        String line;
        String[] col;
        while((line=br.readLine())!=null) {
            col = line.split("#");

            newName.add(col[0]);
            oldName.add(col[1]);
        }
        br.close();
        for(int i=0;i<newName.size();i++) {

            File oldFile = new File("D:\\WorkSoftWare\\JavaProject\\day19-code\\img\\"+oldName.get(i)+".txt");
            System.out.println(oldFile.exists());//看文件是否存在
            File newFile = new File(oldFile.getParent()+File.separator+newName.get(i)+".txt");
            if(newFile.exists()) {
                System.out.println(i+"已存在");//新文件已存在
            } else {
                System.out.println(i+"\t"+oldFile.renameTo(newFile));//旧文件是否重命名成功
            }
        }
    }
}
