package DateDemo3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) throws ParseException {
        //从Date到String
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat();
        String s = sdf.format(d);
        System.out.println(s);

        Date d2 = new Date();
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 222 hh:mm:ss");
        String s2 = sdf2.format(d2);
        System.out.println(s2);

        //从String到Date
        String ss = "2022-08/09 111 12:23:50";
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM/dd 111 hh:mm:ss");
        Date dd= sdf3.parse(ss);
        System.out.println(dd);
    }
}
