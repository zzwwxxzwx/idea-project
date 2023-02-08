package OtherStream.ObjectStream_对象序列化流;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

//    构造方法：
//        ObjectOutputStream( OutputStream out):e创建一个写入指定的 OutputStream的 ObjectOutputStream
//    序列化对象的方法：
//        void writeObject( Object obj):将指定的对象写入 ObjectOutputStream
//    NotSerializableException:抛出一个写例需要一个 Serializable接口。序列化运行时实例的类可能会抛出此异常
//    注1：类的序列化由实现java.io. Serializable接口的类启用。不实现此接口的类将不会使任何状态序列化或反序列化

public class ObjectOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(
                "src\\OtherStream\\ObjectStream_对象序列化流\\oos.txt"));
        Student s = new Student("林青霞",30);
        oos.writeObject(s);
        oos.close();

    }
}
