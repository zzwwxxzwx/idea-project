package OtherStream.SystemInDemo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SystemInDemo {
    public static void main(String[] args) throws IOException {
//        public static final InputStream in:标准输入流。
        InputStream is = System.in;

//        字节流导致中文无法输出
//        int by;
//        while ((by=is.read())!=-1){
//            System.out.println((char) by);

//      因此使用字符流
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("请输入一个字符串：");
        String line = br.readLine();
        System.out.println("你输入的字符串是："+line);

        System.out.println("请输入整数");
        int i = Integer.parseInt(br.readLine());
        System.out.println("你输入的整数是："+i);

//        自己实现太麻烦，所以JAVA提供了类来帮助输入数据
        Scanner sc = new Scanner(System.in);
    }
}

