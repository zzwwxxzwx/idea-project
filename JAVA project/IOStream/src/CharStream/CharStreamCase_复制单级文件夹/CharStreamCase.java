package CharStream.CharStreamCase_复制单级文件夹;

//
//案例：复制单级文件夹
//    需求：把“src\CharStream\CharStreamCase_复制单级文件夹\CopySourceDir”这个文件夹复制到模块目录下
//    思路：
//        ①创建数据源目录File对象，路径是src\CharStream\CharStreamCase_复制单级文件夹\CopySourceDir
//        ②获取数据源目录File对象的名称(CopySourceDir)
//        ③创建目的地目录File对象，路径名是模块名+ itcast组成( src\CharStream\CharStreamCase_复制单级文件夹\CopyDestinationDir)
//        ④判断目的地目录对应的File是否存在，如果不存在，就创建
//        ⑤获取数据源目录下所有文件的Fle数组
//        ⑥遍历File数组，得到每一个File对象，该File对象，其实就是数据源文件
//            如，数据源文件：src\CharStream\CharStreamCase_复制单级文件夹\CopySourceDir\1.txt
//        ⑦获取数据源文件File对象的名称(1.txt)
//        ⑧创建目的地文件File对象，路径名是目的地目录+mn.jpg组成
//            (src\CharStream\CharStreamCase_复制单级文件夹\CopyDestinationDir\1.txt)
//            由于文件不仅仅是文本文件，还有图片，视频等文件，所以采用字节流复制文件

import java.io.*;

public class CharStreamCase {
    public static void main(String[] args) throws IOException {
//        ①创建数据源目录File对象，路径是src\CharStream\CharStreamCase_复制单级文件夹\CopySourceDir
        File srcFolder =new File(
                "src\\CharStream\\CharStreamCase_复制单级文件夹\\CopySourceDir");
//        ②获取数据源目录File对象的名称(CopySourceDir)
        String srcFolderName = srcFolder.getName();
//        ③创建目的地目录File对象，路径名是模块名+ itcast组成
        File destFolder = new File(
                "src\\CharStream\\CharStreamCase_复制单级文件夹\\CopyDestinationDir");
//        ④判断目的地目录对应的File是否存在，如果不存在，就创建
        if (!destFolder.exists()){
            destFolder.mkdir();
        }
//        ⑤获取数据源目录下所有文件的File数组
        File[] listFiles = srcFolder.listFiles();
//        ⑥遍历File数组，得到每一个File对象，该File对象，其实就是数据源文件
        for (File srcFile:listFiles) {
//        ⑦获取数据源文件File对象的名称(1.txt)
            String srcFileName = srcFile.getName();
//        ⑧创建目的地文件File对象，路径名是目的地目录+mn.jpg组成
            File destFile = new File(destFolder,srcFileName);
            copyFile(srcFile,destFile);
            System.out.println(destFile);
        }
    }

    private static void copyFile(File srcFile, File destFile) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));

        byte[] bys = new byte[1024];
        int len ;
        while ((len = bis.read(bys))!=-1){
            bos.write(bys,0,len);
        }
        bis.close();
        bos.close();
    }
}
