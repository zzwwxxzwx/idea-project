package Lists.ListDemo2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("hello");
        list.add("world");
        list.add("java");



        System.out.println(list);
        list.add(1,"javaee");
//        list.add(11,"javaee");//IndexOutOfBoundsException
        System.out.println(list);
        System.out.println("-------");

        System.out.println(list.remove(1));
//        System.out.println(list.remove(11));//IndexOutOfBoundsException
        System.out.println(list);
        System.out.println("----");

        System.out.println(list.set(1,"abc"));
//        System.out.println(list.set(11,"abc"));//IndexOutOfBoundsException
        System.out.println(list);
        System.out.println("------");

        System.out.println(list.get(1));
        System.out.println("--------");
//        System.out.println(list.get(11));//IndexOutOfBoundsException


        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }



    }
}
