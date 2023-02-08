package FileInputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStream_Case1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(
                "C:\\desktop\\idea project\\JAVA project\\IOStream\\src\\FileInputStream\\fis_case1.txt");
        FileOutputStream fos = new FileOutputStream(
                "C:\\desktop\\idea project\\JAVA project\\IOStream\\src\\FileInputStream\\fis_case2.txt");
        int by;
        while ((by=fis.read())!=-1){
            fos.write(by);
        }
        fis.close();
        fos.close();
    }
}
