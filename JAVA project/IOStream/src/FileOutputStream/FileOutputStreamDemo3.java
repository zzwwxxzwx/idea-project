package FileOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//    字节流写数据如何实现换行呢？
//            写完数据后，加换行符
//            windows:\r\n
//            linux:\n
//            mac:\r
//    字节流写数据如何实现追加写入呢？
//        public FileOutputStream(String name, boolean append)
//        创建文件输出流以指定的名称写入文件。如果第二个参数为true,则字节将写入文件的未尾而不是开头

public class FileOutputStreamDemo3 {
    public static void main(String[] args) throws IOException {
//        FileOutputStream fos = new FileOutputStream("src\\fos3.txt");
        FileOutputStream fos = new FileOutputStream("src\\FileOutputStream\\fos3.txt",true);
        //这个true意味着是追加写入，从末尾写入
        //写数据并换行
        for (int i = 0; i < 10; i++) {
            fos.write("hello".getBytes());
            fos.write("\r\n".getBytes());//在不同系统中\n可能不识别，win：\r\n,linux:\n,mac:\r
        }
        //追加写入
        fos.close();
    }
}
