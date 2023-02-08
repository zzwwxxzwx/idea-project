package UDP.UDPSendDemo1;


//2.2 UDP发送数据
//    发送数据的步骤
//        ①创建发送端的Socket对象(DatagramSocket)
//        ②创建数据，并把数据打包
//        ③调用 DatagramSocket树象的方法发送数据
//        ④关闭发送端


import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSendDemo {
    public static void main(String[] args) throws IOException {
//    ①创建发送端的Socket对象(DatagramSocket)
//    DatagramSocket()构造数据报套接字并将其绑定到本地主机上的任何可用端口

        DatagramSocket ds = new DatagramSocket();
//    ②创建数据，并把数据打包
//    DatagramPacket(byte buf[], int offset, int length,InetAddress address, int port)
//    构造一个数据包，发长度为 Length的数据包到指定主机上的指定端口号。
        byte[] bys = "hello,udp,我来了".getBytes();
//        int length = bys.length;
//        InetAddress address = InetAddress.getByName("ZWX-HP");
//        int port = 10086;//端口号
//        DatagramPacket dp = new DatagramPacket(bys,length,address,port);
        DatagramPacket dp = new DatagramPacket(bys,bys.length,InetAddress.getByName("ZWX-HP"),10086);//优化以上四句

//    ③调用 DatagramSocket对象的方法发送数据
//    void send( DatagramPacket p)从此套接字发送数据报包

        ds.send(dp);

//    ④关闭发送端
        ds.close();
    }
}
