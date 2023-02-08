package Set.SetDemo1;


import java.util.HashSet;
import java.util.Set;

//    Set集合特点
//            不包含重复元素的集合
//            没有带索引的方法，所以不能使用普通for循环遍历
//  HashSet:对集合的选代顺序不作任何保证
public class SetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();

        set.add("hello");
        set.add("world");
        set.add("java");
        set.add("hello");

        for (String s: set) {
            System.out.println(s);
        }
    }
}
