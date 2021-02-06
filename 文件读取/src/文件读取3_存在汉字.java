import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class 文件读取3_存在汉字 {
    public static void main(String[] args) throws IOException {
        ClassLoader classLoader = 文件读取3_存在汉字.class.getClassLoader();
        String filePath = classLoader.getResource("").getPath() + "D:\\WorkSoftWare\\JavaProject\\2020.txt";
        System.out.println(filePath);
        File file = new File(filePath);
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            StringBuffer sb = new StringBuffer();
            while (br.ready()) {
                sb.append(br.readLine());
            }
            System.out.println(sb);
        }
    }
}

// 还存在问题*************************************************************
// 还存在问题*************************************************************
// 还存在问题*************************************************************
// 还存在问题*************************************************************
// 还存在问题*************************************************************