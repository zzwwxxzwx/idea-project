package Reflect;

/*
    C1ass对象功能：
        =获取功能：
        1.获取成员变量们
            *Field[] getFields()
            *Field getField(String name)

            *Field[] getDeclaredFields()
            *Field getDeclaredField(String name)
        2.获取构造方法们
            *Constructor<?>[] getConstructors()
            *Constructor<T> getConstructor(类<？>，. parameterTypes)

            *Constructor<T> getDeclaredConstructor(类<？>.. parameterTypes)
            *Constructor<?>[] getDeclaredConstructors()
        3.获取成员方法们：
            *Method[] getMethods()
            *Method getMethod( String name,类<？>. parameterTypes)

            *Method[] getDeclaredMethods()
            *Method getDeclaredMethod( String name,类<？>... parameterTypes)
        4.获取类名
            *String getName()
 */

import domain.Person;

import java.lang.reflect.Field;

public class ReflectDemo2 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
//        0.获取Person的Class对象
        Class personClass = Person.class;
//        1.获取成员变量们
//            *Field[] getFields()
//            *Field getField(String name)
//
//            *Field[] getDeclaredFields()
//            *Field getDeclaredField(String name)
        Field[] fields = personClass.getFields();//只获取public修饰的内容
        for (Field field : fields) {
            System.out.println(field);
        }

        System.out.println("----------");
        Field a = personClass.getField("a");
        //获取成员变量a的值
        Person p = new Person();
        Object value = a.get(p);
        System.out.println(value);
        //设置a的值
        a.set(p, "张三");
        System.out.println(p);

        System.out.println("==========");

        Field[] declaredFields = personClass.getDeclaredFields();//不考虑修饰符
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        System.out.println("-------------");

        Field d = personClass.getDeclaredField("d");
        //需要进行忽略访问权限修饰符的安全检查
        d.setAccessible(true);//暴力反射
        Object value2 = d.get(p);
        System.out.println(value2);


//        2.获取构造方法们
//            *Constructor<?>[] getConstructors()
//            *Constructor<T> getConstructor(类<？>，. parameterTypes)
//
//            *Constructor<T> getDeclaredConstructor(类<？>.. parameterTypes)
//            *Constructor<?>[] getDeclaredConstructors()
//        3.获取成员方法们：
//            *Method[] getMethods()
//            *Method getMethod( String name,类<？>. parameterTypes)
//
//            *Method[] getDeclaredMethods()
//            *Method getDeclaredMethod( String name,类<？>... parameterTypes)
//        4.获取类名
//            *String getName()
    }
}
