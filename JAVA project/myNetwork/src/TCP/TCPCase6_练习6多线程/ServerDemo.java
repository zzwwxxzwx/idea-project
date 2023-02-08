package TCP.TCPCase6_练习6多线程;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10086);

        while(true){
//            监听客户端连接，返回一个对应Socket对象
            Socket s = ss.accept();
//            为每个客户开启一个线程
            new Thread(new ServerThread(s)).start();
        }

    }
}
