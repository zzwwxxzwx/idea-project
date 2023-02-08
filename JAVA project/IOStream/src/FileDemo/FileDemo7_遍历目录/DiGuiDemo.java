package FileDemo.FileDemo7_遍历目录;

import java.io.File;

public class DiGuiDemo {
    public static void main(String[] args) {
        File srcFile = new File("C:\\desktop\\idea project\\JAVA project");//根据给定的路径创建一个File对象
        getAllFilePath(srcFile);//定义一个方法，用于获取给定目录下的所有内容，参数为第1步创健的File对象
    }

    public static void getAllFilePath(File srcFile) {
        File[] fileArr = srcFile.listFiles();//获取给定的File目录下所有的文件或者目录的File数组
        if (fileArr!=null) {
            for (File file : fileArr) {//遍历该File数组，得到每一个File对象
                if (file.isDirectory()) {//判断该File对象是否是目录
                    getAllFilePath(file);//调用方法
                } else {
                    System.out.println("\t"+file.getAbsoluteFile());
                }
            }
        }
    }
}
