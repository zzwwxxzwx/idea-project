package DateDemo4Tool;

import java.text.ParseException;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();

        String s1 = DateUtils.dateToString(d,"yyyy年MM月dd日 HH:mm:ss");
        System.out.println(s1);

        String s2 = DateUtils.dateToString(d, "yyyy年MM月dd日");
        System.out.println(s2);
        System.out.println("-----");

        String s  = "2022-07/12 12:64:64";
        Date dd = DateUtils.stringToDate(s,"yyyy-MM/dd HH:mm:ss");
        System.out.println(dd);
    }
}
