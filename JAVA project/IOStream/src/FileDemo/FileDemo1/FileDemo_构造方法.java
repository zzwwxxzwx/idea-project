package FileDemo.FileDemo1;

import java.io.File;

public class FileDemo_构造方法 {
    public static void main(String[] args) {
        File f1=new File("C:\\desktop\\idea project\\JAVA project\\IOStream\\src\\FileDemo\\FileDemo1\\newFile1.txt");
        System.out.println(f1);//结果输出了路径，说明重写了toString方法

        File f2=new File("C:\\desktop\\idea project\\JAVA project\\IOStream\\src\\FileDemo\\FileDemo1","newFile1.txt");
        System.out.println(f2);//结果输出了路径，说明重写了toString方法

        File f3=new File("C:\\desktop\\idea project\\JAVA project\\IOStream\\src\\FileDemo\\FileDemo1");
        File f4 =new File(f3,"java.txt");
        System.out.println(f4);
    }
}
