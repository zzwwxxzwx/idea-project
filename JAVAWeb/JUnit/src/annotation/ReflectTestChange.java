package annotation;

//框架类

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

@Pro(className = "annotation.Demo1", methodName = "show")
public class ReflectTestChange {
    public static void main(String[] args) throws Exception {

        //框架：不能改变该类的任何代码，可以创建任意类的对象，可以执行任意方法
        //1解析注解
        //1.1获取该类的字节码文件对象
        Class<ReflectTestChange> reflectTestChangeClass = ReflectTestChange.class;
        //2.获取上边的注释对象
        //实际是在内存中生成了一个该注解接口的子类实现对象
        Pro an = reflectTestChangeClass.getAnnotation(Pro.class);
        //3.调用注解对象中定义的抽象方法，获取返回值
        String className = an.className();
        String methodName = an.methodName();
        System.out.println(className);
        System.out.println(methodName);

        //3.加载该类进内存
        Class cls = Class.forName(className);
        //4.创建对象
        Object obj = cls.newInstance();
        //5.获取方法对象
        Method method = cls.getMethod(methodName);
        //6.执行方法
        method.invoke(obj);
    }
}
