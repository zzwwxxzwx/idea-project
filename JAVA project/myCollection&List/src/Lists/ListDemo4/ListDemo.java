package Lists.ListDemo4;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("hello");
        list.add("world");
        list.add("java");

        /*
        ListIterator<String> lit = list.listIterator();
        while (lit.hasNext()){
            String s = lit.next();
            System.out.println(s);
        }
        System.out.println("-----");
        while (lit.hasPrevious()){//此处生效是因为光标处于list末端，即前一个循环
            String s = lit.previous();
            System.out.println(s);
        }
        */

        ListIterator<String> lit = list.listIterator();
        while (lit.hasNext()){
            String s = lit.next();
            if (s.equals("world")) {
                lit.add("javaee");
            }
        }

        System.out.println(list);



    }
}
