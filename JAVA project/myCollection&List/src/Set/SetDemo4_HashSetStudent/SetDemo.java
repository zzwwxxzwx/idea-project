package Set.SetDemo4_HashSetStudent;

import java.util.HashSet;

public class SetDemo {
    public static void main(String[] args) {
        HashSet<Student> hs = new HashSet<>();

        Student s1 = new Student("林青霞",30);
        Student s2 = new Student("张曼玉",35);
        Student s3 = new Student("王祖贤",33);

        Student s4 = new Student("王祖贤",33);//注1：与上一个元素重合，为保证不重复，需要重写equals()和HashCode()

        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        hs.add(s4);

        for (Student s: hs) {
            System.out.println(s.getName()+","+s.getAge());
        }


    }
}
