package ExceptionDemo6Throws;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
//Throw没法直接处理异常，但可以交给调用者进行异常处理
public class ExceptionDemo6 {
    public static void main(String[] args) {
        System.out.println("start");
//        method();
        try {
            method2();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        System.out.println("end");
    }

    //运行时异常：判断方法，帮助文档中查看是否为RuntimeException
    public static void method() throws ArrayIndexOutOfBoundsException {//throw没法处理，只是抛出
        int[] arr = {1, 2, 3};
        System.out.println(arr[3]);//ArrayIndexOutOfBoundsException
    }

    //编译时异常：必须修改，通常用Try——catch
    public static void method2() throws ParseException {
        String s = "2022-08-090";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d = null;
        d = sdf.parse(s);//编译时可能出异常，不意味着一定出异常
        System.out.println(d);
    }
}
