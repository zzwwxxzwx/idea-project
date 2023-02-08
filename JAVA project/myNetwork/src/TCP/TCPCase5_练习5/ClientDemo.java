package TCP.TCPCase5_练习5;

import java.io.*;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("ZWX-HP",10086);

        BufferedReader br = new BufferedReader(new FileReader("src\\TCP\\TCPCase5_练习5\\source.txt"));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line;
        while((line = br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        //自定义结束标记
//        bw.write("886");
//        bw.newLine();
//        bw.flush();

        s.shutdownOutput();//输出结束标记

        BufferedReader brClient = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String data = brClient.readLine();//等待读取数据
        System.out.println("服务器反馈为"+data);

        br.close();
        s.close();
    }
}
