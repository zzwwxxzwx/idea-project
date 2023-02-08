package FileOutputStream;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo4 {
    public static void main(String[] args)  {
//        try {
//            FileOutputStream fos =new FileOutputStream("src\\FileOutputStream\\fos4.txt");
//            fos.write("hello".getBytes());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        FileOutputStream fos = null;//由于try中进行初始化不能使finally中定向fos所以需要在外面初始化
        try {
//            fos = new FileOutputStream("Z:\\src\\FileOutputStream\\fos4.txt");//异常的情况
            fos = new FileOutputStream("src\\FileOutputStream\\fos4.txt");
            fos.write("hello".getBytes());

        }catch (IOException e){
            e.printStackTrace();
        }finally {//为了保证即使出错也释放资源所以需要使用finally来释放资源，它无论什么情况都会进行除非程序崩溃
            if(fos!=null) {//为了保证fos不会空指针，所以需要加入判断，从而提高程序健壮性
                try {
                    fos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
