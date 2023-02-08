package myAPIObject_equals;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ObjectDemo {
    public static void main(String[] args) {
        Student s1 = new Student("",30);
        Student s2 = new Student("",30);
        System.out.println(s1==s2);//由于比较地址值，所以为false

        System.out.println(s1.equals(s2));//此处s2为向上转型为Object

        /*
        public boolean equals(Object obj) {
            return (th is == obj);//注1：this---s1;obj---s2，但是本身是给的地址，需要重写
        }
        */

    }
}
