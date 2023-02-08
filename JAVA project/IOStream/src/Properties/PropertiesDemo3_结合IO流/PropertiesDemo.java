package Properties.PropertiesDemo3_结合IO流;


//Properties和o流结合的方法
//    void Load(Reader reader);
//        从箱入字符流读取属性表（键和元素对）
//    void store(Writer writer, String comments):
//        得此属性列表（键和元素对）写入此 Properties表中。以适合使用load( Reader)方法的格式呵入输出字符流

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args)throws IOException {
        myStore();
        myLoad();
    }

    private static void myLoad() throws IOException {
        Properties prop = new Properties();
//    void Load(Reader reader);
//        从箱入字符流读取属性表（键和元素对）
        FileReader fr = new FileReader("src\\Properties\\PropertiesDemo3_结合IO流\\fw.txt");
        prop.load(fr);
        fr.close();

        System.out.println(prop);

    }

    private static void myStore() throws IOException {
        Properties prop = new Properties();

        prop.setProperty("name1", "林青霞");
        prop.setProperty("name2", "张曼玉");
        prop.setProperty("name3", "王祖贤");

//    void store(Writer writer, String comments):
//        得此属性列表（键和元素对）写入此 Properties表中。以适合使用load( Reader)方法的格式呵入输出字符流
        FileWriter fw = new FileWriter("src\\Properties\\PropertiesDemo3_结合IO流\\fw.txt");
        prop.store(fw,null);
        fw.close();
    }
}
