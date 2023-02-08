package jsoup;

import cn.wanghaomiao.xpath.exception.XpathSyntaxErrorException;
import cn.wanghaomiao.xpath.model.JXDocument;
import cn.wanghaomiao.xpath.model.JXNode;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class jsoupDemo6_XPath {
    public static void main(String[] args) throws IOException, XpathSyntaxErrorException {
        //1获取student.xml的path
        String path = jsoupDemo6_XPath.class.getClassLoader().getResource("student.xml").getPath().replaceAll("%20", " ");
        //2获取Document对象
        Document document = Jsoup.parse(new File(path), "UTF-8");

        //3.根据document对象，创建JXDocument对象
        JXDocument jxDocument = new JXDocument(document);

        //4.结合xpath语法查询
        //4.1获取所有student标签
        List<JXNode> jxNodes = jxDocument.selN("//student");
        for (JXNode jxNode : jxNodes) {
            System.out.println(jxNode);
        }
        System.out.println("-------------");

        //4.2获取所有student标签下的name标签
        List<JXNode> jxNodes2 = jxDocument.selN("//student/name");
        for (JXNode jxNode : jxNodes2) {
            System.out.println(jxNode);
        }
        System.out.println("--------");

        //4.3获取所有student标签下的带有id属性的name标签
        List<JXNode> jxNodes3 = jxDocument.selN("//student/name[@id]");
        for (JXNode jxNode : jxNodes3) {
            System.out.println(jxNode);
        }
        System.out.println("-------------");

        //4.3获取所有student标签下的带有id属性的name标签属性值为zwx
        List<JXNode> jxNodes4 = jxDocument.selN("//student/name[@id='zwx']");
        for (JXNode jxNode : jxNodes4) {
            System.out.println(jxNode);
        }
        System.out.println("-------------");


    }
}
