package OtherStream.SystemOutDemo1;

import java.io.PrintStream;

public class SystemOutDemo {
    public static void main(String[] args) {
        PrintStream ps = System.out;

        ps.println("hello");
        ps.println(100);

        ps.print("hello");
        ps.print(100);
//        ps.print();//此方法不可存在

        //System.out本质是字节输出流
        System.out.println("hello");
        System.out.println(100);
    }
}
