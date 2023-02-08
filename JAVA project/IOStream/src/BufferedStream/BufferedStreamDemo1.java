package BufferedStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamDemo1 {
    public static void main(String[] args) throws IOException {
//        FileOutputStream fos =new FileOutputStream("src\\BufferedStream\\bos1.txt");
//        BufferedOutputStream bos = new BufferedOutputStream(fos);
        //与上两句等价
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src\\BufferedStream\\bos1.txt"));
        bos.write("hello\r\n".getBytes());
        bos.write("world\r\n".getBytes());

        bos.close();

        //缓冲输入流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src\\BufferedStream\\bos1.txt"));

//        //一次读取一个字节数据
//        int by;
//        while ((by = bis.read())!=-1){
//            System.out.print((char)by);
//        }

        //一次读取一个字节数组数据
        byte[] bys = new byte[1024];
        int len;
        while ((len=bis.read())!=-1){
            System.out.print(new String(bys,0,len));
        }

        bis.close();
    }
}
