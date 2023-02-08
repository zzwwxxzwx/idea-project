package jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class jsoupDemo4_Document_Element属性值文本内容 {
    public static void main(String[] args) throws IOException {
        //1获取student.xml的path
        String path = jsoupDemo4_Document_Element属性值文本内容.class.getClassLoader().getResource("student.xml").getPath().replaceAll("%20", " ");
        //2获取Document对象
        Document document = Jsoup.parse(new File(path), "UTF-8");
        /*
        		4. Element：元素对象
			1. 获取子元素对象
				* getElementById (String id)：根据id属性值获取唯一的element对象
				* getElementsByTag (String tagName)：根据标签名称获取元素对象集合
				* getElementsByAttribute (String key)：根据属性名称获取元素对象集合
				* getElementsByAttributeValue (String key, String value)：根据对应的属性名和属性值获取元素对象集合

			2. 获取属性值
				* String attr(String key)：根据属性名称获取属性值
			3. 获取文本内容
				* String text():获取文本内容
				* String html():获取标签体的所有内容(包括字标签的字符串内容)
         */
        // 通过document对象获取name标签的所有子元素，共两个
        Elements elements = document.getElementsByTag("name");
        System.out.println(elements.size());
        System.out.println("------------------");

        // 通过document对象获取子标签对象
        Element element_student = document.getElementsByTag("student").get(0);
        Elements ele_name = element_student.getElementsByTag("name");
        System.out.println(ele_name.size());
        System.out.println("---------------");

        // 获取student对象的属性值
        String number = element_student.attr("number");
        System.out.println(number);
        System.out.println("-------------");

        //获取文本内容
        String text = ele_name.text();
        String html = ele_name.html();
        System.out.println(text);				//* String text():获取文本内容
        System.out.println(html);   //* String html():获取标签体的所有内容(包括字标签的字符串内容)


    }
}
