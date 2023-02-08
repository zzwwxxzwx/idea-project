package CalendarDemo2;

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c);

        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int date = c.get(Calendar.DATE);
        System.out.println(year +"年"+month+"月"+date+"日");

        // public abstract void add( int field, int amount):根据日历的规则，将指定的时间量添加或减去给定的日历字段
        c.add(Calendar.YEAR,-3);
        c.add(Calendar.DATE,+10);//三年前的10天后
        year = c.get(Calendar.YEAR);
        month = c.get(Calendar.MONTH) + 1;
        date = c.get(Calendar.DATE);
        System.out.println(year +"年"+month+"月"+date+"日");

        // public final void set( int year, int month, int date):设置当前日历的年月日
        c.set(2000,11,20);
        year = c.get(Calendar.YEAR);
        month = c.get(Calendar.MONTH) + 1;
        date = c.get(Calendar.DATE);
        System.out.println(year +"年"+month+"月"+date+"日");

    }
}
