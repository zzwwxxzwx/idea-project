package CharStream.CharStreamCase_复制多级文件夹;

import java.io.*;

//案例：复制多级文件夹
//    需求：把复制到F盘目录下
//    思路：
//        ①创建数据源File对象，路径是src\CharStream\CharStreamCase_复制多级文件夹\CopySourceDir
//        ②创建目的地File对象，路径是src\CharStream\CharStreamCase_复制多级文件夹\CopyDestinationDir
//        ③写方法实现文件夹的复制，参数为数据源File对象和目的地File对象
//        ④判断数据源File是否是目录
//        是：
//            A:在目的地下创建和数据源File名称一样的目录
//            B:获取数据源File下所有文件或者目录的File数组
//            C:遍历该File数组，得到每一个File对象
//            D:把该File作为数据源File对象，递归调用复制文件的方法
//        不是：说明是文件，直接复制，用字节流

public class CharStreamCase {
    public static void main(String[] args) throws IOException {
//    ①创建数据源File对象，路径是src\CharStream\CharStreamCase_复制多级文件夹\CopySourceDir
        File srcFile = new File(
                "src\\CharStream\\CharStreamCase_复制多级文件夹\\CopySourceDir");
//    ②创建目的地File对象，路径是src\CharStream\CharStreamCase_复制多级文件夹\CopyDestinationDir
        File destFile = new File(
                "src\\CharStream\\CharStreamCase_复制多级文件夹\\CopyDestinationDir");
//    ③写方法实现文件夹的复制，参数为数据源File对象和目的地File对象
        copyFolder(srcFile, destFile);


    }

    //复制文件夹
    private static void copyFolder(File srcFile, File destFile) throws IOException {
//    ④判断数据源File是否是目录
        if (srcFile.isDirectory()) {
//            A:在目的地下创建和数据源File名称一样的目录
            String srcFileName = srcFile.getName();
            File newFolder = new File(destFile, srcFileName);
            if (!newFolder.exists()) {
                newFolder.mkdir();
                System.out.println("创建目录" + newFolder.getName());
            }
//            B:获取数据源File下所有文件或者目录的File数组
            File[] fileArray = srcFile.listFiles();
//            C:遍历该File数组，得到每一个File对象
            for (File file : fileArray) {
//            D:把该File作为数据源File对象，递归调用复制文件的方法
                copyFolder(file, newFolder);
            }
        } else {
            //当它是文件，直接复制文件，用字节流
            File newFile = new File(destFile, srcFile.getName());
            copyFile(srcFile, newFile);
        }
    }

    private static void copyFile(File srcFile, File destFile) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));
        System.out.println("复制文件" + srcFile.getName());
        byte[] bys = new byte[1024];
        int len;
        while ((len = bis.read(bys)) != -1) {
            bos.write(bys, 0, len);
        }
        bis.close();
        bos.close();
    }
}
