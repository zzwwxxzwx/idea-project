package OtherStream.ObjectStream_对象序列化流;


//用对象序列化流序列化了一个对象后，假如我们修改了对象所属的类文件，读取数据会不会出问题呢？
//    Student中添加toString后
//    java.io.InvalidClassException: OtherStream.ObjectStream_对象序列化流.Student;
//        当序列化运行时检测到类中的以下问题之一时抛出。
//        的串行版本与从流中读取的类描述符的类型不匹配
//        该类包合未知的数据类型
//        该类没有可访问的无参数构造函数
//    local class incompatible: stream classdesc serialVersionUID = -5081310429256736789,//本来该读取的ID
//    local class serialVersionUID = 2003468690849712732//Student实际读取的ID

//如果出问题了，如何解决呢？
//    注1：给对象所属的类加一个值： private static final long serialVersionUID=42L;

//如果一个对象中的某个成员变量的值不想被序列化，又该如何实现呢？
//    注2：加transient关键字
import java.io.*;

public class ObjectStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        write();
        read();

    }
    //序列化
    private static void write() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(
                "src\\OtherStream\\ObjectStream_对象序列化流\\oos1.txt"));
        Student s = new Student("林青霞",30);
        oos.writeObject(s);
        oos.close();
    }
    //反序列化
    private static void read() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
                "src\\OtherStream\\ObjectStream_对象序列化流\\oos1.txt"));
        Object obj = ois.readObject();
        Student s = (Student)obj;
        System.out.println(s.getName()+","+s.getAge());
        ois.close();
    }
}
