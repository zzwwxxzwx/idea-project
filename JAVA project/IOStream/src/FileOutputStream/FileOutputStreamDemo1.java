package FileOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("src\\FileOutputStream\\fos.txt");
//        做了三件事情
//            A:调用系统功能创建了文件
//            B:创建了字节输出流对象
//            C:让字节输出流对象指向创建好的文件
        fos.write(97);//输入的是ASCii码的对应字符
        fos.write(55);

        fos.close();//最后需要关闭输出流

    }
}
