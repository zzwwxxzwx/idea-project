package BufferedStream;

//需求
//    把文件字节流复制文件case1.txt"，avi复制到模块目录下的字节流复制文件case1o.txt"
//        思路：
//            1:根据数据源创建字节输入流对象
//            2:根据目的地创建字节输出流对象
//            3:读写数据，复制图片（一次读取一个字节数组，一次写入一个字节数组）
//            4:释放资源
//        四种方式实现复制视频，井记录每种方式复制视频的时间
//            1:基本字节流一次读写一个字节
//            2:基本字节流一次读写一个字节数组
//            3:字节缓冲流一次读写一个字节
//            4:字节缓冲流一次读写一个字节数组

import java.io.*;

public class BufferedStream_Case1 {
    public static void main(String[] args) throws IOException {
        long startTime = System.currentTimeMillis();

//        1:基本字节流一次读写一个字节
//            method1();//共耗时12959ms
//        2:基本字节流一次读写一个字节数组
//            method2();//共耗时23ms
//        3:字节缓冲流一次读写一个字节
//            method3();//共耗时75ms
//        4:字节缓冲流一次读写一个字节数组
//            method4();//共耗时8ms


        long endTime = System.currentTimeMillis();
        System.out.println("共耗时"+(endTime-startTime)+"ms");
    }

    private static void method4() throws IOException {
        BufferedInputStream bis =new BufferedInputStream (new FileInputStream(
                "C:\\desktop\\idea project\\JAVA project\\IOStream\\src\\BufferedStream\\case1.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(
                "C:\\desktop\\idea project\\JAVA project\\IOStream\\src\\BufferedStream\\case1o.txt"));

        byte[]bys=new byte[1024];
        int len;
        while ((len=bis.read(bys))!=-1){
            bos.write(bys,0,len);
        }
        bis.close();
        bos.close();

    }

    private static void method3() throws IOException {
        BufferedInputStream bis =new BufferedInputStream (new FileInputStream(
                "C:\\desktop\\idea project\\JAVA project\\IOStream\\src\\BufferedStream\\case1.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(
                "C:\\desktop\\idea project\\JAVA project\\IOStream\\src\\BufferedStream\\case1o.txt"));

        int by;
        while((by=bis.read())!=-1){
            bos.write(by);
        }
        bis.close();
        bos.close();

    }

    private static void method2() throws IOException {
        FileInputStream fis= new FileInputStream(
                "C:\\desktop\\idea project\\JAVA project\\IOStream\\src\\BufferedStream\\case1.txt");
        FileOutputStream fos = new FileOutputStream(
                "C:\\desktop\\idea project\\JAVA project\\IOStream\\src\\BufferedStream\\case1o.txt");

        byte[] bys = new byte[1024];
        int len;
        while ((len=fis.read(bys))!=-1){
            fos.write(bys,0,len);
        }
        fis.close();
        fos.close();

    }

    private static void method1() throws IOException {
        FileInputStream fis= new FileInputStream(
                "C:\\desktop\\idea project\\JAVA project\\IOStream\\src\\BufferedStream\\case1.txt");
        FileOutputStream fos = new FileOutputStream(
                "C:\\desktop\\idea project\\JAVA project\\IOStream\\src\\BufferedStream\\case1o.txt");

        int by;
        while ((by=fis.read())!=-1){
            fos.write(by);
        }
        fis.close();
        fos.close();
    }
}
