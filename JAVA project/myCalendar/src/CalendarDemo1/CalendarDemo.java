package CalendarDemo1;

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();//以多态形式获取对象
        System.out.println(c);
//        public int get(int field)
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;//月份是第几个月，从0开始计算
        int date = c.get(Calendar.DATE);
        System.out.println(year +"年"+month+"月"+date+"日");
    }
}
