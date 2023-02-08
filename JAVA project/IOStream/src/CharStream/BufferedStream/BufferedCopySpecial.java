package CharStream.BufferedStream;

import java.io.*;


//案例：复制Java文件（字符缓冲流特有功能改进版）
//    需求：把模块目录下的CopySourceBuffer.txt复制到模块目录下的CopyDestinationBuffer.txt
//    思路：
//        ①根据数据源创建字符缓冲输入流对象
//        ②根据目的地创建字符缓冲输出流对象
//        ③读写数据，复制文件
//            使用字符缓冲流特有功能实现
//        ⑤释放资源


public class BufferedCopySpecial {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(
                "src\\CharStream\\BufferedStream\\CopySourceBuffer.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter(
                "src\\CharStream\\BufferedStream\\CopyDestinationBuffer.txt"));

        String line;
        while ((line=br.readLine())!=null){
            bw.write(line);
            bw.newLine();//不要忘记换行
            bw.flush();
        }

        bw.close();
        br.close();

    }
}
