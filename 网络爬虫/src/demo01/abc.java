package demo01;

import org.apache.commons.compress.utils.IOUtils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class abc {
    public static void main(String[] args) {
        InputStream inpustream = null;
        FileOutputStream outputstream = null;

        try {
            long start = System.currentTimeMillis();
            int i = 0;
            for (i = 1; i < 550; i++) {
                URL url = new URL("http://www.bokee.com//topic/images/%E6%9C%AA%E6%A0%87%E9%A2%98-2(" + i + ").jpg");
                inpustream = url.openStream();

//            http://www.bokee.com//topic/images/%E6%9C%AA%E6%A0%87%E9%A2%98-1(530).jpg
//            <img src="/_upload/article/images/66/b6/810dfe294d62aa81fba5ca1baef9/57c958b6-72e8-4331-a431-24b06039b649.jpg">
//            <img src="/_upload/article/images/99/a1/416529614b32ba6a2f824bbbafae/04b85865-f1b9-4128-b33f-04eff1e81c5a.jpg">
                outputstream = new FileOutputStream("D:\\WorkSoftWare\\JavaProject\\网络爬虫\\img\\" + i + ".png");
                IOUtils.copy(inpustream, outputstream);
            }
            long end = System.currentTimeMillis();

            System.out.println("下载成功，耗时" + (start - end) + "毫秒");
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
