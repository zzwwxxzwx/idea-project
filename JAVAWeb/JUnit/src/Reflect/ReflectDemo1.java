package Reflect;

import domain.Person;

public class ReflectDemo1 {
    public static void main(String[] args) throws Exception {
        //1.Class.forName("全类名")
        Class cls1=Class.forName("domain.Person");
        System.out.println(cls1);
        //2.类名.class
        Class cls2= Person.class;
        System.out.println(cls2);
        //3.对象.getClass()
        Person p = new Person();
        Class cls3 = p.getClass();
        System.out.println(cls3);

        //== 比较三个对象
        System.out.println(cls1==cls2);
        System.out.println(cls1==cls3);
        System.out.println(cls2==cls3);
        //都为true同一个字节码文件只加载一次，无论使用以上那种方式获取的class
    }
}
