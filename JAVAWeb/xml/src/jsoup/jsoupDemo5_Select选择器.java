package jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class jsoupDemo5_Select选择器 {
    public static void main(String[] args) throws IOException {
        //1获取student.xml的path
        String path = jsoupDemo5_Select选择器.class.getClassLoader().getResource("student.xml").getPath().replaceAll("%20", " ");
        //2获取Document对象
        Document document = Jsoup.parse(new File(path), "UTF-8");

        //3查询name标签
        Elements elements = document.select("name");
        System.out.println(elements);
        System.out.println("-----------------");

        //4查询id为zwx的元素
        Elements elements1 = document.select("#zwx");
        System.out.println(elements1);
        System.out.println("---------------");

        //5获取student标签并且number属性值为zwx01的age子标签
        //5.1获取student标签并且属性值为zwx01
        Elements elements2 = document.select("student[number='zwx01']");
        System.out.println(elements2);
        System.out.println("----------------");
        //5.2获取student标签并且属性值为zwx01的age子标签
        Elements elements3 = document.select("student[number='zwx01']>age");
        System.out.println(elements3);
        System.out.println("----------------");

    }
}
