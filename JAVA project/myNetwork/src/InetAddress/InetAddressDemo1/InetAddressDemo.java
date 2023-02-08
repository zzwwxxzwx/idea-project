package InetAddress.InetAddressDemo1;


//            方法名                                                 说明
//        static InetAddress getByName(String host)       确定主机名称的IP地址。主机名称可以是机器名称，也可以是IP地址
//        String getHostName()                            获取此IP地址的主机名
//        String getHostAddress()                         返回文本显示中的IP地址字符串


import java.io.IOException;
import java.net.InetAddress;

public class InetAddressDemo {
    public static void main(String[] args) throws IOException {
        //static InetAddress getByName(String host)确定主机名称的IP地址。主机名称可以是机器名称，也可以是IP地址
//        InetAddress address = InetAddress.getByName("zwx-HP");
        InetAddress address = InetAddress.getByName("172.16.2.124");

        //String getHostName()获取此IP地址的主机名
        String name = address.getHostName();

        //String getHostAddress()返回文本显示中的IP地址字符串
        String ip = address.getHostAddress();

        System.out.println("主机名"+name);
        System.out.println("IP地址"+ip);



    }
}
