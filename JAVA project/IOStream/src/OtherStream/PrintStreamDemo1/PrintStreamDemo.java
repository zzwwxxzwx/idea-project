package OtherStream.PrintStreamDemo1;

import java.io.IOException;
import java.io.PrintStream;

//    打印流的特点：
//            只负责输出数据，不负责读取数据
//            有自己的特有方法
//            字节打印流
//            PrintStream( String fileName):使用指定的文件名创建新的打印流

public class PrintStreamDemo {
    public static void main(String[] args) throws IOException {
        PrintStream ps = new PrintStream("src\\OtherStream\\PrintStreamDemo1\\ps.txt");

        //字节输出流的方法
        ps.write(97);//写入97编码的ASCii，结果为a

        //使用特有方法写数据
        ps.print(97);//写入97
        ps.println(98);
        ps.println(88);

        ps.close();


    }
}
