package FileStreamCases;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("src\\FileStreamCases\\CopySourse.txt");

        FileOutputStream fos = new FileOutputStream("src\\FileStreamCases\\PasteResult.txt");
        int by;
        while ((by=fis.read())!=-1){
            System.out.print((char)by);

            fos.write(by);
        }
        fis.close();
        fos.close();
    }
}
