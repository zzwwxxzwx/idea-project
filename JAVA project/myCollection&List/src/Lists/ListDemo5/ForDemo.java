package Lists.ListDemo5;

import java.util.ArrayList;

public class ForDemo {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        for (int i : arr) {
            System.out.println(arr[i-1]);
        }
        System.out.println("------------");

        String[] strArray={"hello","world","java"};
        for (String s:strArray) {
            System.out.println(s);
        }
        System.out.println("------------");

        ArrayList<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("world");
        list.add("java");

        for (String s :list){
            System.out.println(s);
        }

        //内部原理是一个Iterator迭代器
        for (String s :list){
            if(s.equals("world")){
                list.add("javaee");//ConcurrentModificationException
            }
        }






    }
}
