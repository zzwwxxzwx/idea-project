package Lists.ListDemo6_ArrayListAndLinkList;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListDemo {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();

        array.add("hello");
        array.add("world");
        array.add("java");


        for (String s : array) {
            System.out.println(s);
        }
        System.out.println("------");

        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.add("hello");
        linkedList.add("world");
        linkedList.add("java");

        for (String s:linkedList) {
            System.out.println(s);
        }

    }
}
