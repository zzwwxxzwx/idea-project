package TCP.ServerDemo1;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
//        ①创建服务器端的Socket对象(ServerSocket)
//        ServerSocket(int port) 创建绑定到指定端口的服务器套接字
        ServerSocket ss =new ServerSocket(10086);

//        Socket accept() 侦听与此套接字建立的连接并接受它。
        Socket s = ss.accept();
//        ②获取输入流，读数据，并把数据易示在控制台
        InputStream is = s.getInputStream();
        byte[]bys = new byte[1024];
        int len = is.read(bys);
        String data = new String(bys,0,len);
        System.out.println("数据是："+data);
//        ③释放资源
        s.close();
        ss.close();

    }
}
