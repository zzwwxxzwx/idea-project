package Set.SetDemo5_LinkedHashSet_3_6;

import java.util.LinkedHashSet;

public class SetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();

        linkedHashSet.add("hello");
        linkedHashSet.add("world");
        linkedHashSet.add("java");

        linkedHashSet.add("java");

        for(String s : linkedHashSet){
            System.out.println(s);
        }
    }
}
