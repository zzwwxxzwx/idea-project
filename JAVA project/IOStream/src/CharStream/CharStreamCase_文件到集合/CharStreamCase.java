package CharStream.CharStreamCase_文件到集合;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
//案例：文件到集合
//    需求：把文本文件中的数据读取到集合中，并遍历集合。要求：文件中每一行数据是一个集合元素
//    思路：
//        ①创建字符缓冲输入流对象
//        ②创建 ArrayList集合对象
//        ③调用字符缓冲输入流对象的方法读数据
//        ④把读取到的字符串数据存储到集合中
//        ⑤释放资源
//        ⑥遍历集合


public class CharStreamCase {
    public static void main(String[] args) throws IOException {
//        ①创建字符缓冲输入流对象
        BufferedReader br = new BufferedReader(new FileReader("src\\CharStream\\CharStreamCase_文件到集合\\input.txt"));
//        ②创建 ArrayList集合对象
        ArrayList<String > array = new ArrayList<String>();
//        ③调用字符缓冲输入流对象的方法读数据
        String line;
        while ((line=br.readLine())!=null){
//        ④把读取到的字符串数据存储到集合中
            array.add(line);
        }
//        ⑤释放资源
        br.close();
//        ⑥遍历集合
        for (String s :array) {
            System.out.println(s);
        }
    }
}
