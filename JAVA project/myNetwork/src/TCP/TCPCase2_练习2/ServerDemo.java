package TCP.TCPCase2_练习2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
//        创建服务器端的 Socket对象(ServerSocket)
        ServerSocket ss = new ServerSocket(10086);
//        监听客户端连接。返回一个Socket对象
        Socket s = ss.accept();
//        获取输入流
//        InputStream is = s.getInputStream();
//        InputStreamReader isr = new InputStreamReader(is);
//        BufferedReader br = new BufferedReader(isr);
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String line;
        while ((line= br.readLine())!=null){
            System.out.println(line);
        }


//        释放资源
//        s.close();
        ss.close();
    }
}
