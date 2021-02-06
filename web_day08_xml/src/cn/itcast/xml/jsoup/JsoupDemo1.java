package cn.itcast.xml.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

/*
    Jsoup快速入门
 */
public class JsoupDemo1 {
    public static void main(String[] args) throws IOException {
        // 2. 获取Document对象，根据xml文档来获取
        // 2.1 获取student.xml的path
        String path = JsoupDemo1.class.getClassLoader().getResource("student.xml").getPath();
        // 2.2解析xml文档，加载文档内存，获取dom树 --> Document
        Document document = Jsoup.parse(new File(path), "utf-8");
        // 3. 获取元素对线 Element
        Elements elements = document.getElementsByTag("name");

        System.out.println(elements.size());
        // 3.1 获取第一个name的element对象
        Element element = elements.get(0);
        // 3.2 获取数据
        String name = element.text();
        System.out.println(name);

    }
}
