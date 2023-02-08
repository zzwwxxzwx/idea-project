package jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class jsoupDemo2 {
    public static void main(String[] args) throws IOException {
        //获取Document对象,根据xml文档获取
        //2.1获取student.xml的path
        String path = jsoupDemo2.class.getClassLoader().getResource("student.xml").getPath().replaceAll("%20", " ");
        //2.2解析xml文档并加载进内存，获取dom树-->Document对象
        Document document = Jsoup.parse(new File(path), "UTF-8");
        //解析xml或html字符串

//        String str = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
//                "<!-- \n" +
//                "\t1.填写xml文档的根元素\n" +
//                "\t2.引入xsi前缀.  xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\n" +
//                "\t3.引入xsd文件命名空间.  xsi:schemaLocation=\"http://www.itcast.cn/xml  student.xsd\"\n" +
//                "\t4.为每一个xsd约束声明一个前缀,作为标识  xmlns=\"http://www.itcast.cn/xml\" \n" +
//                "\t\n" +
//                "\t\n" +
//                " -->\n" +
//                " <students   xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\n" +
//                " \t\t\t xmlns=\"http://www.itcast.cn/xml\" \n" +
//                " \t\t   xsi:schemaLocation=\"http://www.itcast.cn/xml  xsd/student.xsd\"\n" +
//                " \t\t    >\n" +
//                " \t<student number=\"zwx01\">\n" +
//                " \t\t<name>tom</name>\n" +
//                " \t\t<age>18</age>\n" +
//                " \t\t<sex>male</sex>\n" +
//                " \t</student>\n" +
//                "\n" +
//                "\t<student number=\"zwx01\">\n" +
//                "\t\t<name>jack</name>\n" +
//                "\t\t<age>18</age>\n" +
//                "\t\t<sex>female</sex>\n" +
//                "\t</student>\n" +
//                "\t\t \n" +
//                " </students>";
//        Document document1 = Jsoup.parse(str);
//        System.out.println(document1);
        //Jsoup.parse(URL,int timeoutMillis)通过网络路径获取指定html或xml的文档对象
        URL url = new URL("https://www.baidu.com");// 创建URL对象
        Document document2 = Jsoup.parse(url,10000);// 创建Document对象
        System.out.println(document2);

    }
}
