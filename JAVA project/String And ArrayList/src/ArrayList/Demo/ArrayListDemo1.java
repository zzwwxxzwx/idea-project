package ArrayList.Demo;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();

        System.out.println("array="+array);

        System.out.println(array.add("abc"));
        array.add("java");
        array.add("hello");

        array.add(1,"add1");

        System.out.println(array);

    }
}
