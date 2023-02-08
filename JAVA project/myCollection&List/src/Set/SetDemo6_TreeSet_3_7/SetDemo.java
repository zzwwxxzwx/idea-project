package Set.SetDemo6_TreeSet_3_7;


import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<Integer>();

        ts.add(10);
        ts.add(40);
        ts.add(30);
        ts.add(50);
        ts.add(20);

        for (Integer i:ts) {
            System.out.println(i);//按照自然顺序输出
        }
    }
}
