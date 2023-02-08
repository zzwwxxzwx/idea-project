package sort.comparable.test;

import sort.comparable.comparablesort.student;

public class TestComparable {
    public static void main(String[] args) {
        student s1 = new student();
        s1.setUsername("alen");
        s1.setAge(123);

        student s2 = new student();
        s2.setUsername("belinda");
        s2.setAge(20);

        Comparable max = getMax(s1,s2);
        System.out.println(max);
    }

    public static Comparable getMax(Comparable c1, Comparable c2) {
        int result = c1.compareTo(c2);
        //result<0则c1小。。。
        if (result > 0) {
            return c1;
        } else {
            return c2;
        }
    }
}
