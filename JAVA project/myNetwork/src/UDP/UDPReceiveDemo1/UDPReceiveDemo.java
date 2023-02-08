package UDP.UDPReceiveDemo1;


import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

//    ①创建接收端的 Socket对象(DatagramSocket)
//    DatagramSocket(int port)
//    ②创建一个数据包，用于接收数据
//    DatagramPacket(byte[] buf, int length)
//    ③调用 DatagramSocket对象的方法接收数据
//    void receive(DatagramPacket p)
//    ④解析数据包，并把数据在控制台显示
//    byte getData()
//    int getLength()
//    ⑤关闭接收端
//    void close()

public class UDPReceiveDemo {
    public static void main(String[] args) throws IOException {
//    ①创建接收端的 Socket对象(DatagramSocket)
//    DatagramSocket(int port)
        DatagramSocket ds = new DatagramSocket(10086);

//    ②创建一个数据包，用于接收数据
//    DatagramPacket(byte[] buf, int length)
        byte[] bys = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bys, bys.length);

//    ③调用 DatagramSocket对象的方法接收数据
//    void receive(DatagramPacket p)
        ds.receive(dp);

//    ④解析数据包，并把数据在控制台显示
//    byte getData()
//    int getLength()
//        int len = dp.getLength();
//        byte[] datas = dp.getData();
//        String dataString = new String(datas, 0, len);//这里的0，len是得到数据的长度，不然会由空字符来代替前面的1024大小的数据块
//        System.out.println("数据是" + dataString);
        //以上四句可优化为
        System.out.println("数据是" + new String(dp.getData(),0,dp.getLength()));

//    ⑤关闭接收端
//    void close()
        ds.close();

    }
}
