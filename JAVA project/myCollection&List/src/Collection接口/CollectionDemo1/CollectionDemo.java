package Collection接口.CollectionDemo1;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();

        c.add("hello");
        c.add("world");
        c.add("java");
        c.add("world");//可重复

        System.out.println(c);
    }
}
