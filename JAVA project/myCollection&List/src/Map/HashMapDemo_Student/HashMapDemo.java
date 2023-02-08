package Map.HashMapDemo_Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String,Student> hm= new HashMap<String,Student>();

        Student s1 = new Student("林青霞",30);
        Student s2 = new Student("张曼玉",35);
        Student s3 = new Student("王祖贤",33);

        hm.put("xs01",s1);
        hm.put("xs02",s2);
        hm.put("xs03",s3);

        Set<String>keySet= hm.keySet();
        for(String key :keySet){
            Student value = hm.get(key);
            System.out.println(key+","+value.getName()+","+value.getAge());
        }

        Set<Map.Entry<String, Student>> entrySet = hm.entrySet();
        for (Map.Entry<String, Student> me :entrySet){
            String key = me.getKey();
            Student value = me.getValue();
            System.out.println(key+","+value.getName()+","+value.getAge());
        }
    }
}
