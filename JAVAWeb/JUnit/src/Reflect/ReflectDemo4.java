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

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectDemo4 {
    public static void main(String[] args) throws Exception {
//        0.获取Person的Class对象
        Class personClass = Person.class;

//        3.获取成员方法们：
//            *Method[] getMethods()
//            *Method getMethod( String name,类<？>. parameterTypes)
        //获取指定名称的方法
        Method eat_method = personClass.getMethod("eat");
        Person p = new Person();
        eat_method.invoke(p);

        Method eat_method2 = personClass.getMethod("eat", String.class);//指定参数列表
        //执行方法
        eat_method2.invoke(p,"饭");

        //获取所有public修饰的方法
        for (Method method : personClass.getMethods()) {
            System.out.println(method);
            method.setAccessible(true);
            System.out.println(method.getName());
        }
        System.out.println("---------");


//            *Method[] getDeclaredMethods()
//            *Method getDeclaredMethod( String name,类<？>... parameterTypes)
//        4.获取类名
//            *String getName()
        String ClassName = personClass.getName();
        System.out.println(ClassName);
    }
}
