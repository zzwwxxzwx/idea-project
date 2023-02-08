package DateDemo2;

import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        Date d = new Date();

        System.out.println(d.getTime());
        System.out.println("现在距1970年1月1日00;00;00一共有" + d.getTime() * 1.0 / 1000 / 60 / 60 / 24 / 365 + "年");
        System.out.println("-------");

        long time = 1000 * 60 * 60;//设置基本时间
        d.setTime(time);
        System.out.println(d);
        time = System.currentTimeMillis();//设置当前系统时间
        d.setTime(time);
        System.out.println(d);
    }
}
