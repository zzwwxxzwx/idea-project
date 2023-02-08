package Set.SetDemo10_Case_不重复的随机数;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
//        Set<Integer> set = new HashSet<Integer>();//单独的HashSet没有
        Set<Integer> set = new TreeSet<Integer>();//TreeSet有顺序

        //创建随机数对象
        Random r = new Random();

        //判断集合的长度是否小于10
        while (set.size()<10){
            int number = r.nextInt(20) + 1;
            set.add(number);
        }

        for(Integer i : set){
            System.out.println(i);
        }
    }
}
