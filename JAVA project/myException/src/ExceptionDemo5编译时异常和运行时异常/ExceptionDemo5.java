package ExceptionDemo5编译时异常和运行时异常;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo5 {
    public static void main(String[] args) {
//        method();
        method2();

    }

    //运行时异常：判断方法，帮助文档中查看是否为RuntimeException
    public static void method() {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);//ArrayIndexOutOfBoundsException
    }

    //编译时异常：必须修改，通常用Try——catch
    public static void method2() {
        String s = "2022-08-090";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d = null;
        try {
            d = sdf.parse(s);//编译时可能出异常，不意味着一定出异常
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        System.out.println(d);
    }
}
