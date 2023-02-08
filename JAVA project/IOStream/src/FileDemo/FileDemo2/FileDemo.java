package FileDemo.FileDemo2;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        //需求1:我要在FileDemo2目录下创建一个文件java.txt
        File f1 = new File("C:\\desktop\\idea project\\JAVA project" +
                "\\IOStream\\src\\FileDemo\\FileDemo2\\java.txt");
        System.out.println(f1.createNewFile());
        //需求2:我要在FileDemo2目录下创建一个目录JavaSE
        File f2 = new File("C:\\desktop\\idea project\\JAVA project" +
                "\\IOStream\\src\\FileDemo\\FileDemo2\\JavaSE");
        System.out.println(f2.mkdir());
        //需求3:我要在FileDemo2目录下创建一个多级目录 JavaWEB\\HTML
        File f3 = new File("C:\\desktop\\idea project\\JAVA project" +
                "\\IOStream\\src\\FileDemo\\FileDemo2\\JavaWEB\\HTML");
        System.out.println(f3.mkdirs());
        //需求4:我要在FileDemo2目录下创一个文件javase.txt
        File f4 = new File("C:\\desktop\\idea project\\JAVA project" +
                "\\IOStream\\src\\FileDemo\\FileDemo2\\javase.txt");
        System.out.println(f4.mkdir());//虽然可以运行，但是最后生成的是一个文件夹
    }
}
