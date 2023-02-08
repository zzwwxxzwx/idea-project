package jsoup;

import cn.wanghaomiao.xpath.exception.XpathSyntaxErrorException;
import cn.wanghaomiao.xpath.model.JXDocument;
import cn.wanghaomiao.xpath.model.JXNode;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;

public class jsoupDemo测试 {
    public static void main(String[] args) throws IOException, XpathSyntaxErrorException {
//        URL url = new URL("https://movie.douban.com/chart");
        URL url = new URL("https://www.baidu.com/");
        Document document = Jsoup.parse(url, 10000);


        JXDocument jxDocument = new JXDocument(document);

        List<JXNode> jxNodes = jxDocument.selN("//a[@class]/@href");
        for (JXNode jxNode : jxNodes) {
            System.out.println(jxNode.toString());
        }


//        String html = document.html();
//        System.out.println(html);


    }
}
