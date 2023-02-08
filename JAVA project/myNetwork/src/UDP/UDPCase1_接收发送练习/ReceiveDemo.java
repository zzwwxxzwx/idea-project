package UDP.UDPCase1_接收发送练习;


import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

//    按下面的要求实现程序
//        UDP发送数据：数据来自于键盘录入，直到输入的数据是886,发送数据结束
//        UDP接收数据：因为接收端不知道发送端什么时候停止发送，故采用死循环接收
public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        //创建接收端的 Socket对象(DatagramSocket)
        DatagramSocket ds  = new DatagramSocket(12345);
        //创建一个数据包，用于接收数据
        while (true) {
            byte[] bys = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bys, bys.length);
            //调用 DatagramSocket对象的方法接收数据
            ds.receive(dp);
            //解析数据包，并把数据在控制台星示
            System.out.println("数据是：" + new String(dp.getData(), 0, dp.getLength()));
        }
        //关闭接收端

    }
}
