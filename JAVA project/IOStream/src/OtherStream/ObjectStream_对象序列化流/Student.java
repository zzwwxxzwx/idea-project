package OtherStream.ObjectStream_对象序列化流;

import java.io.Serializable;

public class Student implements Serializable {//注1：有接口继承就意味着可以序列化
    private String name;
//    private int age;
    private transient int age;//注2
    private static final long serialVersionUID = 42L;//注1

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
