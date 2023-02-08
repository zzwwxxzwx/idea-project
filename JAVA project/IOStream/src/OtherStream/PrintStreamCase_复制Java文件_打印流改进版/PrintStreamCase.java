package OtherStream.PrintStreamCase_复制Java文件_打印流改进版;

import java.io.*;
//
//案例：复制Java文件（打印流改进版）
//    需求：
//        把模块目录下的source.txt复制到模块目录下的destination
//    思路：
//        1:根据数据源创建字符输入流对象
//        2:根据目的地创建字符输出流对象
//        3:读写数据，复制文件
//        4:释放资源

public class PrintStreamCase {
    public static void main(String[] args) throws IOException {

/*
//        1:根据数据源创建字符输入流对象
        BufferedReader br = new BufferedReader(new FileReader(
                "src\\OtherStream\\PrintStreamCase_复制Java文件_打印流改进版\\source.txt"));
//        2:根据目的地创建字符输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter(
                "src\\OtherStream\\PrintStreamCase_复制Java文件_打印流改进版\\destination.txt"));
//        3:读写数据，复制文件
        String line;
        while ((line= br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
//        4:释放资源
        br.close();
        bw.close();
*/

//        1:根据数据源创建字符输入流对象
        BufferedReader br = new BufferedReader(new FileReader(
                "src\\OtherStream\\PrintStreamCase_复制Java文件_打印流改进版\\source.txt"));
//        2:根据目的地创建字符输出流对象
        PrintWriter pw = new PrintWriter(new FileWriter(
                "src\\OtherStream\\PrintStreamCase_复制Java文件_打印流改进版\\destination.txt"),true);
        String line;
        while ((line=br.readLine())!=null){
            pw.println(line);
        }
        br.close();
        pw.close();

    }
}
