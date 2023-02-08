package CharStream.BufferedStream;

import java.io.*;

public class BufferedCopy {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(
                "src\\CharStream\\BufferedStream\\CopySource.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter(
                "src\\CharStream\\BufferedStream\\CopyDestination.txt"));

        //一次读取一个字符数据
        int ch;
        while ((ch=br.read())!=-1){
            bw.write(ch);
        }

        //一次读取一个字符数组数据
//        char[] chs=new char[1024];
//        int len;
//        while ((len=br.read(chs))!=-1){
//            bw.write(chs,0,len);
//        }

        br.close();
        bw.close();
    }

}
