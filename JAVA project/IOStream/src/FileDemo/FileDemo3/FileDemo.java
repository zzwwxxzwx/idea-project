package FileDemo.FileDemo3;

/*
File类的判断和获取功能：
public boolean isDirectory():测试此抽象路径名表示的File是否为目录
public boolean isFile()测试此抽象路径名表示的File是否为文件
public boolean exists():测试此抽象路径名表示的File是否存在
public String getAbsolutePath()i返回此抽象路径名的绝对路径名字符串
public String getPath():将此抽象路径名转换为路径名字符串
public String getName()返回由此抽象路径名表示的文件或目录的名称
public String[]List()返回此抽象路径名表示的目录中的文件和目录的名称字符串数组
public File[] listFiles(),返回此抽象路径名表示的目录中的文件和目录的Fle对象数组
 */

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        File f = new File("src\\FileDemo\\FileDemo3\\FileDemo3result.txt");
        f.createNewFile();

//        public boolean isDirectory():测试此抽象路径名表示的File是否为目录
//        public boolean isFile()测试此抽象路径名表示的File是否为文件
//        public boolean exists():测试此抽象路径名表示的File是否存在
        System.out.println(f.isDirectory());
        System.out.println(f.isFile());
        System.out.println(f.exists());
        System.out.println("----------");

//        public String getAbsolutePath()i返回此抽象路径名的绝对路径名字符串
//        public String getPath():将此抽象路径名转换为路径名字符串
//        public String getName()返回由此抽象路径名表示的文件或目录的名称
        System.out.println(f.getAbsoluteFile());
        System.out.println(f.getPath());
        System.out.println(f.getName());
        System.out.println("----------");

//        public String[]List()返回此抽象路径名表示的目录中的文件和目录的名称字符串数组
//        public File[] listFiles(),返回此抽象路径名表示的目录中的文件和目录的File对象数组
        File f2 = new File("src\\FileDemo\\FileDemo3");
        String[] strArray = f2.list();
        for (String str : strArray) {//不可以用于判断
            System.out.println(str);
        }
        System.out.println("-------");

        File[] fileArray = f2.listFiles();
        for (File file : fileArray) {//可以用于判断
            System.out.println(file);
            System.out.println(file.getName());
            if (file.isFile()){
                System.out.println(file.getName());
            }
        }

    }
}
