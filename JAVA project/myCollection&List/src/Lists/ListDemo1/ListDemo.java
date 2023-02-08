package Lists.ListDemo1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("hello");//List集合可重复

        System.out.println(list);

        Iterator <String> it = list.listIterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }


    }
}
