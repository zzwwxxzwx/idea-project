package OtherStream.PrintWriterDemo1;


//字符打印流 PrintWriter的构造方法：
//        方法名                                                     说明
//        PrintWriter(String fileName)                    使用指定的文件名创建一个新的 PrintWriter,而不需要自动执行刷新
//        PrintWriter(Writer out, boolean autoFlush)      创建一个新的 PrintWriter
//        out:字符输出流
//        autoFlush:一个布尔值，如果为真，
//        则 printin, printf,或format方法将刷新输出缓冲区

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args)throws IOException {
/*        PrintWriter pw = new PrintWriter(
                "src\\OtherStream\\PrintWriterDemo1\\pw.txt");

        pw.write("hello");
        pw.write("\r\n");
        pw.flush();//字符流需要flush
        pw.write("world");
        pw.write("\r\n");
        pw.flush();


//            pw.println("hello");相当于
//            pw.write("hello");
//            pw.write("\r\n");

        pw.println("hello");
        pw.flush();
        pw.println("world");
        pw.flush();
*/

//        PrintWriter(Writer out, boolean autoFlush)      创建一个新的 PrintWriter
        PrintWriter pw = new PrintWriter(new FileWriter(
                "src\\OtherStream\\PrintWriterDemo1\\pw.txt",true));
        //true保证了自动刷新
        pw.println("hello");
        pw.println("world");

        pw.close();
    }
}
