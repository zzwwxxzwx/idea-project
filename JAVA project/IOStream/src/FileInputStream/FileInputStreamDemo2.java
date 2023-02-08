package FileInputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src\\FileInputStream\\fis2.txt");
//      调用字节输入流对象的读数据方法
//      int read(byte[]b):从该输入流读取最多b. length个字节的数据到一个字节数组
//        byte[] bys =new byte[5];
//        第一次读数据
//        int len = fis.read(bys);
//        System.out.println(len);
//        System.out.println(new String(bys));//结果为hello
//        第二次读取
//        len = fis.read(bys);
//        System.out.println(len);
//        System.out.println(new String(bys));//结果为wor因为有换行符
//        第三次读取
//        len = fis.read(bys);
//        System.out.println(len);//结果为2，即只读取到2位
//        System.out.println(new String(bys));//结果为ld


//        System.out.println(new String(bys,0,len));//从0读到第len位，照道理前面也应该改成如此方式
        //读取到没有数据则返回-1

        //用循环优化
        byte[] bys = new byte[1024];//常采用1024及其整数倍
        int len;
        while ((len = fis.read(bys))!=-1){
            System.out.print(new String(bys,0,len));
        }

        fis.close();


    }
}
