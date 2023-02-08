package FileInputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//    需求：把文件fos.txt中的内容读取出来在控制台输出
//            FilelnputStream:从文件系统中的文件获取输入字节
//            FilelnputStream( String name):通过打开与实际文件的连接来创建一个 FileinputStream,该文件由文件系统中的路径名name命名
//        使用字节输入流读数据的步骤：
//            ①创建字节输入流对象
//            ②调用字节输入流对象的读数据方法
//            ③释放资源

public class FileInputStreamDemo1 {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("src\\FileInputStream\\fis1.txt");
        //一次一次读取
        /*
        int by = fis.read();
        System.out.println(by);
        System.out.println((char) by);

        by = fis.read();
        System.out.println(by);
        by = fis.read();
        System.out.println(by);//当没有数据后将返回-1
        by = fis.read();
        System.out.println(by);
        */

        //循环读取
        /*
        int by=fis.read();
        while(by !=-1){
            System.out.print((char)by);
            by = fis.read();
        }*/

        //优化以上循环
        int by;
        while ((by=fis.read())!=-1){
            System.out.print((char) by);
        }

        fis.close();
    }
}
