package Generic.GenericDemo6可变参数;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class ArgsDemo2 {
    public static void main(String[] args) {
//        List<String> list = Arrays.asList("hello", "world", "java");
//
//        list.add("javaee");//UnsupportedOperationException
//        list.remove("world");//UnsupportedOperationException
//        list.set(1,"javaee");//因为set不影响集合大小，所以可以做
//
//        System.out.println(list);


//        List<String> list = List.of("hello","world","java","world");//可重复元素
//        list.add("javaee");//UnsupportedOperationException
//        list.remove("world");//UnsupportedOperationException
//        list.set(1,"javaee");//UnsupportedOperationException
//        System.out.println(list);

        Set<String> set = Set.of("hello", "world", "java");
//        Set<String> set = Set.of("hello", "world", "java","world");//IllegalArgumentException,因为set不能有重复元素

        set.add("javaee");//UnsupportedOperationException
        set.remove("world");//UnsupportedOperationException
//        set没有索引所以没有set操作

        System.out.println(set);

    }
}
