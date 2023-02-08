package CharStream.CharStreamDemo;


//案例：字符流输出Java文件
//    需求：
//        把模块目录下的 ConversionStreamDemo..jav复制到模块目录下的Copy.java
//    数据源和目的地的分析
//        数据源： src\CharStream说明文档\CopySource.txt--读数据--- Reader-- InputStreamReader--- FileReader
//        目的地： src\CharStream说明文档\CopyDestination.txt--写数据-- Writer-- OutputStreamWriter--- FileWriter
//    思路：
//        1:根据数据源创建字符输入流对象
//        2:根据目的地创建字符输出流对象
//        3:读写数据，复制文件
//        4:释放资源

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyJavaDemo {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader(
                "src\\CharStream\\CharStreamDemo\\CopySource.txt");
        FileWriter fw = new FileWriter(
                "src\\CharStream\\CharStreamDemo\\CopyDestination.txt");


//        int ch;
//        while ((ch=fr.read())!=-1){
//            fw.write(ch);
//            System.out.println(ch);
//        }

        char[] chs = new char[1024];
        int len;
        while ((len= fr.read(chs))!=-1){
            fw.write(chs,0,len);
        }

        fw.close();
        fr.close();
    }
}
