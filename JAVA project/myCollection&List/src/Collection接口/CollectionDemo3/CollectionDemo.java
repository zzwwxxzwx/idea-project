package Collection接口.CollectionDemo3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();

        c.add("hello");
        c.add("world");
        c.add("java");


        Iterator<String> it = c.iterator();
        /*
            public Iterator<E> iterator() {
                return new Itr();
            }

            private class Itr implements Iterator<E> {
                ...
            }
        */
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());
////        System.out.println(it.next());//该访问结果为NoSuchElementException：表示被请求的元素不存在

        while (it.hasNext()){
//            System.out.println(it.next());
            String s = it.next();//与上句相比，可以对数据进行其他处理
            System.out.println();
        }

        System.out.println(c);
    }
}
