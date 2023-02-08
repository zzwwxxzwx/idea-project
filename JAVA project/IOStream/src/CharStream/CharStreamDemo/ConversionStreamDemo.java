package CharStream.CharStreamDemo;

import java.io.*;

//        OutputStreamWriter( OutputStream out)创建一个M使用默认字符编码的 OutputStreamWriter.
//        OutputStreamWriter( OutputStream out, String charsetName)创建一个使用命名字符集的 OutputStreamWriter

public class ConversionStreamDemo {
    public static void main(String[] args) throws IOException {

//        FileOutputStream fos = new FileOutputStream(
//                "src\\CharStream说明文档\\osw.txt");
//        OutputStreamWriter osw = new OutputStreamWriter(fos);
        //与上两句等价
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(
                "src\\CharStream\\CharStreamDemo\\osw.txt"),"UTF-8");
        osw.write("中国");
        osw.close();

        InputStreamReader isr = new InputStreamReader(new FileInputStream(
                "src\\CharStream\\CharStreamDemo\\osw.txt"));
        //一次读取一个字符数据
        int ch;
        while ((ch=isr.read())!=-1){
            System.out.println((char) ch);
        }
        isr.close();

    }
}
