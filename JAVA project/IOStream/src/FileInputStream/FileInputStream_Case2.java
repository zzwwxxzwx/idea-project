package FileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStream_Case2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis= new FileInputStream(
                "C:\\desktop\\idea project\\JAVA project\\IOStream\\src\\FileInputStream\\picture1.png");
        FileOutputStream fos=new FileOutputStream(
                "C:\\desktop\\idea project\\JAVA project\\IOStream\\src\\FileInputStream\\picture2.png");
        byte[] byt =new byte[1024];
        int len;
        while ((len=fis.read(byt))!=-1){
            fos.write(byt,0,len);
//            System.out.println(new String(byt,0,len));
        }
        fis.close();
        fos.close();
    }
}
