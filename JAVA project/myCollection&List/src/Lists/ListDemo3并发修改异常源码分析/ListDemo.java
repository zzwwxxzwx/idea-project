package Lists.ListDemo3并发修改异常源码分析;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("hello");
        list.add("world");
        list.add("java");

//        //遍历集合，得到每一个元素，看有没有 world'"这个元素，如果有，我就添加一个" javaee"元素，请写代码实现
//        Iterator<String> it = list.iterator();
//        while(it.hasNext()){
//            String s =it.next();//注1：调用方法出问题：ConcurrentModificationException
//            if (s.equals("world")) {
//                list.add("javaee");
//            }
//        }

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if (s.equals("world")){
                list.add("javaee");
            }
        }



        System.out.println(list);



    }
}
