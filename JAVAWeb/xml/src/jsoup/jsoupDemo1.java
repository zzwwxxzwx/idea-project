package jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class jsoupDemo1 {
    public static void main(String[] args) throws IOException {
        //获取Document对象,根据xml文档获取
        //2.1获取student.xml的path
        String path = jsoupDemo1.class.getClassLoader().getResource("student.xml").getPath().replaceAll("%20", " ");
        //2.2解析xml文档并加载进内存，获取dom树-->Document对象

        Document document = Jsoup.parse(new File(path), "UTF-8");
        //3.1获取元素对象Element
        Elements elements = document.getElementsByTag("name");
        //3.2获取数据
        String name = elements.text();
        System.out.println(name);


    }



}
