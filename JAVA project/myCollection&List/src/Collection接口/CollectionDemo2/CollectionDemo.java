package Collection接口.CollectionDemo2;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();

//        System.out.println(c.add("hello"));
//        System.out.println(c.add("world"));
//        System.out.println(c.add("world"));//查看源码发现add永远返回true
//        System.out.println(c);

        c.add("hello");
        c.add("world");
        c.add("java");
        System.out.println(c.size());
        System.out.println(c.remove("world"));
        System.out.println(c.remove("world123"));
        System.out.println(c.size());
        System.out.println(c);

        System.out.println("----------");
        System.out.println(c.contains("world"));
        System.out.println(c.contains("world123"));

        System.out.println("----------");
        System.out.println(c.isEmpty());
        c.clear();
        System.out.println(c);
        System.out.println(c.isEmpty());

    }
}
