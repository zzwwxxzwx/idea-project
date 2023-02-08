package Collections类.CollectionsDemo1_概述和使用;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(30);
        list.add(20);
        list.add(50);
        list.add(10);
        list.add(40);

        Collections.sort(list);//自然排序

        Collections.reverse(list);//反转顺序

        Collections.shuffle(list);//随机排序

        System.out.println(list);
    }
}
