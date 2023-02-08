package FileOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileOutputStreamDemo2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("src\\FileOutputStream\\fos2.txt");
        fos.write(97);

//        byte[] bys = {97,98,99,100,101};
        byte[] bys = "abcde".getBytes();//和上句有同样效果

        fos.write(bys);
        //将bys.length个字节从指定的字节数组写入此文件输出流，一次写一个字节数组数据

        fos.write(bys,1,3);//从索引1开始写3位
        //将len字节从指定的字节数组开始，从偏移量off开始写入此文件输出流，一次写一个字节数组的部分数据
        fos.close();
    }
}
