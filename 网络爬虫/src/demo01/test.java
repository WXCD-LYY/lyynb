package demo01;

import org.apache.commons.compress.utils.IOUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class test {
    public static void main(String[] args) {
        long startMS = System.currentTimeMillis();

        FileInputStream fis = null;
        FileOutputStream fos = null;


        try {
            fis = new FileInputStream("D:\\WorkSoftWare\\JavaProject\\网络爬虫\\t1\\txt1.txt");
            fos = new FileOutputStream("D:\\WorkSoftWare\\JavaProject\\网络爬虫\\t2\\txt2.txt");
            IOUtils.copy(fis, fos, 1024);
            long endMS = System.currentTimeMillis();
            System.out.println("拷贝完成 耗时" + (endMS - startMS));

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            try {
                fis.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
    }
}


