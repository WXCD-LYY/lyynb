import java.io.*;

public class 文件读取2 {
    public static void main(String[] args) {

        //读取c盘的file1文件

        File file = new File("D:\\WorkSoftWare\\JavaProject\\2020.txt");

        BufferedInputStream bis = null;

        FileInputStream fis= null;

        try

        {

            //第一步 通过文件路径来创建文件实例

            fis = new FileInputStream(file);

          /*把FileInputStream实例 传递到 BufferedInputStream

            目的是能快速读取文件

           */

            bis = new BufferedInputStream(fis);

            /*available检查是不是读到了文件末尾 */

            while( bis.available() > 0 ){

                System.out.print((char)bis.read());

            }

        }catch(FileNotFoundException fnfe)

        {

            System.out.println("文件不存在" + fnfe);

        }

        catch(IOException ioe)

        {

            System.out.println("I/O 错误: " + ioe);

        }

        finally

        {

            try{

                if(bis != null && fis!=null)

                {

                    fis.close();

                    bis.close();

                }

            }catch(IOException ioe)

            {

                System.out.println("关闭InputStream句柄错误: " + ioe);

            }

        }

    }
}
