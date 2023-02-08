package TCP.TCPCase6_练习6多线程;

import java.io.*;
import java.net.Socket;

public class ServerThread implements Runnable {
    private Socket s;

    public ServerThread(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
        //接收数据到文本文件中
        try {
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(s.getInputStream()));
//            BufferedWriter bw = new BufferedWriter(new FileWriter(
//                    "src\\TCP\\TCPCase6_练习6多线程\\copy.txt"));//存在名称冲突问题
            int count = 0;
            File file = new File("src\\TCP\\TCPCase6_练习6多线程\\copy[" + count + "].txt");
            while (file.exists()) {
                count++;
                file = new File("src\\TCP\\TCPCase6_练习6多线程\\copy[" + count + "].txt");
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));

            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
                bw.flush();
            }

            //给出反馈
            BufferedWriter bwServer = new BufferedWriter(
                    new OutputStreamWriter(s.getOutputStream()));
            bwServer.write("文件上传成功");
            bwServer.newLine();
            bwServer.flush();

            //释放资源
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
