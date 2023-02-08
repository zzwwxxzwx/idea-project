package FileDemo.FileDemo4_File类删除功能;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        File f1 = new File("src\\FileDemo\\FileDemo4_File类删除功能\\java.txt");
        System.out.println(f1.createNewFile());

        System.out.println("是否删除刚刚创建的"+f1.getPath()+"确认请输入Y");
        Scanner sc =new Scanner (System.in);
        String com = sc.nextLine();
        if (com.equals("Y")){
            System.out.println(f1.delete());
            System.out.println("--------");
        }

        File f3 = new File("src\\FileDemo\\FileDemo4_File类删除功能\\javadir");
        System.out.println(f3.mkdir());
        File f4 = new File("src\\FileDemo\\FileDemo4_File类删除功能\\javadir\\java.txt");
        System.out.println(f4.createNewFile());

        System.out.println("是否删除刚刚创建的"+f3.getPath()+"以及其子目录文件？确认请输入Y");
        Scanner sc2 =new Scanner (System.in);
        String com2 = sc2.nextLine();
        if (com2.equals("Y")){
            System.out.println(f4.delete());//delete只能删除空文件夹，所以需要先删除文件再删目录
            System.out.println(f3.delete());
            System.out.println();
        }
    }
}
