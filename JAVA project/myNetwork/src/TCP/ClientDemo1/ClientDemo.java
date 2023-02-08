package TCP.ClientDemo1;

//    发送数据的步骤
//        ①创建客户端的Socket对象(Socket)
//        ②获取输出流，写数据
//        ③释放资源

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {

//        ①创建客户端的Socket对象(Socket)
//        Socket( InetAddress address, int port)创建流套接字并将其连接到指定rp地址的指定端口号
//        Socket s = new Socket(InetAddress.getByName("ZWX-HP"),10000);
//        Socket(String host, int port) 创建一个流套接字，并将其连接到命名主机上的指定端口号。
        Socket s =new Socket("ZWX-HP",10086);//直接运行会ConnectException，因为没有创建服务器
//        ②获取输出流，写数据
//        getOutputStream()  返回此套接字的输出流。
        OutputStream os = s.getOutputStream();
        os.write("hello,tcp,我来了".getBytes());
//        ③释放资源
//        os.close();
        s.close();//因为os在s中创建，所以只需要s.close()


    }
}
