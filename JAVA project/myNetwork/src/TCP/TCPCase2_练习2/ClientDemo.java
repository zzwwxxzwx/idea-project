package TCP.TCPCase2_练习2;

import java.io.*;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
//        创建客户端的Socket对象(Socket)
        Socket s = new Socket("ZWX-HP",10086);
//        数据来自于键盘录入，直到输入的数据是886，发送数据结束
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        封装输出流对象
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        String line;
        while ((line= br.readLine())!=null){
            if("886".equals(line)){
                break;
            }
//            获取输出流
//            OutputStream os =s.getOutputStream();
//            os.write(line.getBytes());
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        s.close();//因为os和is在s中创建，所以只需要s.close

    }
}
