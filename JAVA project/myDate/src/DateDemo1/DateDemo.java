package DateDemo1;

import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        Date d1 = new Date();//public Date(),分配一个Date对象，并切始化，以便它代表它被分配的时间，精确到毫秒
        System.out.println(d1);

//        public Date(long date)分配一个Date对象，并将其初始化为表示从标准基准时间起指定的毫秒数
        long date  = 1000*60*60;
        Date d2 = new Date((date));
        System.out.println(d2);
    }
}
