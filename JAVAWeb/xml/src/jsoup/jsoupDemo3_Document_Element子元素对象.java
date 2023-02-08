package jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class jsoupDemo3_Document_Element子元素对象 {
    public static void main(String[] args) throws IOException {
        //1获取student.xml的path
        String path = jsoupDemo3_Document_Element子元素对象.class.getClassLoader().getResource("student.xml").getPath().replaceAll("%20", " ");
        //2获取Document对象
        Document document = Jsoup.parse(new File(path), "UTF-8");
        //3获取student对象
        Elements elements = document.getElementsByTag("student");
        System.out.println(elements);

        System.out.println("--------------");

        //3.2获取属性名为id的元素对象们
        Elements elements1 = document.getElementsByAttribute("id");
        System.out.println(elements1);
        System.out.println("--------------");
        //3.3获取为number值为的元素对象们
        Elements elements2 = document.getElementsByAttributeValue("number", "zwx01");
        System.out.println(elements2);
        //3.4获取id属性值的元素对象

    }
}
