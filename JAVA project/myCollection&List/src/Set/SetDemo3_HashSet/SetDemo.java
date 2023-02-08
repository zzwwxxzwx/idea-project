package Set.SetDemo3_HashSet;

import java.util.HashSet;

public class SetDemo {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();

        hs.add("hello");
        hs.add("world");
        hs.add("java");
        hs.add("hello");

        for (String s:hs) {
            System.out.println(s);
        }
    }
}
