package CharStream.CharStreamDemo;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

//需求：字节流读文本文件数据
//    一个汉字存储：
//        如果是GBK编码，占用2个字节
//        如果是uTF·8编码，占用3个字节

public class StringDemo1 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "中国";

//        byte[] bys = s.getBytes();
//        System.out.println(Arrays.toString(bys));//结果为[-28, -72, -83, -27, -101, -67]说明是UTF-8

//        byte[] bys = s.getBytes("UTF-8");
//        System.out.println(Arrays.toString(bys));//结果为[-28, -72, -83, -27, -101, -67]确认是UTF-8

//        byte[] bys = s.getBytes("GBK");
//        System.out.println(Arrays.toString(bys));//结果为[-42, -48, -71, -6]说明不同编码方式得到结果不同

        byte[] bys = s.getBytes("UTF-8");
        System.out.println(Arrays.toString(bys));

        String ss =new String(bys);//平台指定字符集
        System.out.println(ss);

        ss=new String(bys,"GBK");
        System.out.println(ss);

        ss=new String(bys,"UTF-8");
        System.out.println(ss);
    }
}
