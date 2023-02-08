package CharStream.CharStreamCase_点名器;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

//案例：点名器
//    需求：我有一个文件里面存储了班级同学的姓名，每一个姓名占一行，要求通过程序实现随机点名器
//    思路：
//        ①创建字符缓冲输入流对象
//        ②创建 ArrayList集合对象
//        ③调用字符缓冲输入流对象的方法读数据
//        ④把读取到的字符串数据存储到集合中
//        ⑤释放资源
//        ⑥使用 Random产生一个随机数，随机数的范围在：[O,集合的长度)
//        ⑦把第6步产生的随机数作为索引到 ArrayList集合中获取值
//        ⑧把第7步得到的数据出在控制台
public class CharStreamCase {
    public static void main(String[] args) throws IOException {
//        ①创建字符缓冲输入流对象
        BufferedReader br =new BufferedReader( new FileReader("src\\CharStream\\CharStreamCase_点名器\\names.txt"));
//        ②创建 ArrayList集合对象
        ArrayList<String> arr = new ArrayList<String>();
//        ③调用字符缓冲输入流对象的方法读数据
        String line;
        while((line= br.readLine())!=null){
//        ④把读取到的字符串数据存储到集合中
            arr.add(line);
        }
//        ⑤释放资源
        br.close();
//        ⑥使用 Random产生一个随机数，随机数的范围在：[O,集合的长度)
//        Random r = new Random();
//        int index = r.nextInt(arr.size());
        int index  = new Random().nextInt(arr.size());
//        ⑦把第6步产生的随机数作为索引到 ArrayList集合中获取值
        String name = arr.get(index);

//        ⑧把第7步得到的数据出在控制台
        System.out.println("幸运儿是"+name);
    }
}
