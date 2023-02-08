package TCP.TCPCase1_练习1;

import java.io.*;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
//        创建客户端的Socket对象( Socket)
        Socket s = new Socket("ZWX-HP",10086);
//        获取输出流,写数据
        OutputStream os = s.getOutputStream();
        os.write((new BufferedReader(new InputStreamReader(System.in))).readLine().getBytes());
//        接收服务器反馈
        InputStream is = s.getInputStream();
        byte[]bys = new byte[1024];
        int len =is.read(bys);
        String data = new String(bys,0,len);
        System.out.println("客户端："+data);
//        释放资源
//        os.close();
//        is.close();
        s.close();//因为os和is在s中创建，所以只需要s.close

    }
}
