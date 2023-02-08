package ArrayList.Demo;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();

        array.add("hello");
        array.add("world");
        array.add("java");

//        System.out.println(array.remove("world"));
//        System.out.println(array);
//        System.out.println(array.remove("abc"));
//        System.out.println(array);

//        System.out.println(array.remove("abc"));
//        System.out.println(array);
//
//        System.out.println(array.remove("world"));
//        System.out.println(array);


        System.out.println(array.get(2));
        System.out.println(array);
        System.out.println(array.set(2,"123"));
        System.out.println(array);
        System.out.println(array.size());


    }

}
