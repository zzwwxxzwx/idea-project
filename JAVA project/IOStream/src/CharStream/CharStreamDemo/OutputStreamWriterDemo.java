package CharStream.CharStreamDemo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

//    方法名                                                 说明
//            void write(int c)                               写一个字符
//            void write(char[] cbuf)                         写入一个字符数组
//            void write(char[] cbuf, int off, int len)       写入字符数组的一部分
//            void write(String str)                          写个字符串
//            void write(String str, int off, int len)        写一个字符串的一部分

public class OutputStreamWriterDemo {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw =new  OutputStreamWriter(new FileOutputStream(
                "src\\CharStream\\CharStreamDemo\\osw2.txt"));
/*  1、刷新流方法
        osw.write(97);
//        void flush():刷新流
        //注：字符流不像字节流，需要进行刷新(flush)才能才能在文件中产生，因为本质上来说是有缓冲的
        osw.flush();
        osw.write(98);
*/

        char[] chs = {'a','b','c'};

/*  2、写一个字符数组的一部分
        osw.write(chs,0,chs.length);
        osw.write(chs,1,2);//从数组第‘1’个读取2位
*/

/*  3、写一个字符串的一部分
        osw.write("abcde",0,"abcde".length());
        osw.write("abcde",1,3);
*/
        //释放资源，但先会进行一次刷新
        osw.close();
    }
}
