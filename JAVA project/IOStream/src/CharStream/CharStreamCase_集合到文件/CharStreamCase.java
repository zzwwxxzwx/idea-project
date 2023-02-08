package CharStream.CharStreamCase_集合到文件;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.AbstractList;
import java.util.ArrayList;

//案例：集合到文件
//    需求：把 ArrayList集合中的字符串数据写入到文本文件。要求：每一个字符串元素作为文件中的一行数据
//    思路：
//        ①创建 ArrayList集合
//        ②往集合中存储字符串元素
//        ③创建字符缓冲输出流对象
//        ④遍历集合，得到每一个字符申数据
//        ⑤调用字符缓冲输出流对象的方法写数据
//        ⑥释放资源




public class CharStreamCase {
    public static void main(String[] args) throws IOException {
//    ①创建 ArrayList集合
        AbstractList<String> array=new ArrayList<String>();

//    ②往集合中存储字符串元素
        array.add("hello");
        array.add("world");
        array.add("java");
//    ③创建字符缓冲输出流对象
        BufferedWriter bw = new BufferedWriter( new FileWriter("src\\CharStream\\CharStreamCase_集合到文件\\output.txt"));

//    ④遍历集合，得到每一个字符串数据
        for (String    s :array              ) {
//    ⑤调用字符缓冲输出流对象的方法写数据
            bw.write(s);
            bw.newLine();
            bw.flush();
        }

//    ⑥释放资源
        bw.close();
    }
}
