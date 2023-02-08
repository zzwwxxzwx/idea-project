package CharStream.BufferedStream;

import java.io.*;

//BufferedWriter:
//    void newLine():写一行行分隔符，行分隔符字符串由系统属性定义
//BufferedReader:
//    public String readLine():读一行文字。结果包含行的内容的字符串，不包括任何行终止字符，如果流的结尾已经到达，则为null

public class BufferedStreamDemo2 {
    public static void main(String[] args) throws IOException {
    /*
        BufferedWriter bw = new BufferedWriter(new FileWriter(
        "src\\CharStream\\BufferedStream\\bw2.txt"));

        for (int i = 0; i < 10; i++) {
            bw.write("hello"+i);
//            bw.write("\r\n");//只适用于win
            bw.newLine();//可适用于所有平台
            bw.flush();
        }

        bw.close();

     */

        BufferedReader br = new BufferedReader(new FileReader(
                "src\\CharStream\\BufferedStream\\bw2.txt"));

//        String line = br.readLine();
//        System.out.println(line);
//
//        line = br.readLine();
//        System.out.println(line);
//
//        line = br.readLine();
//        System.out.println(line);

        //循环改进读取
        String line;
        while ((line=br.readLine())!=null){
            System.out.println(line);//注意此处是println因为读取不带有换行符
        }
        br.close();
    }
}
