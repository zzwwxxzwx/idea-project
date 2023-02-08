package Map.HashMapDemo_Student2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap< Student,String> hm= new HashMap<Student,String>();

        Student s1 = new Student("林青霞",30);
        Student s2 = new Student("张曼玉",35);
        Student s3 = new Student("王祖贤",33);
        Student s4 = new Student("王祖贤",33);//注1：由于重复需要重写HashMap和equals方法

        hm.put(s1,"西安");
        hm.put(s2,"武汉");
        hm.put(s3,"郑州");
        hm.put(s4,"北京");

        Set<Student>keySet = hm.keySet();
        for(Student key :keySet){
            String value = hm.get(key);
            System.out.println(key.getName()+","+key.getAge()+","+value);
        }
    }
}
