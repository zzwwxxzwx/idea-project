package Collections类.CollectionDemo2_ArrayList储存学生对象并排序;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionDemo {
    public static void main(String[] args) {
        //创建 ArrayList集合对象
        ArrayList<Student> array = new ArrayList<Student>();
        //创建学生对象
        Student s1= new Student("linqingxia",30);
        Student s2= new Student(  "zhangmanyu",  35);
        Student s3= new Student(  "wangzuxian",  33);
        Student s4 =new Student(  "liuyan",  33);
        //把学生添加到集合
        array.add(s1);
        array.add(s2);
        array.add(s3);
        array.add(s4);
        //sort (List<T> list, Comparator<? super T>c)
//        Collections.sort(array);//无法直接进行排序,需要实现接口
        Collections.sort(array, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num = s1.getAge()-s2.getAge();
                int num2 = num==0?s1.getName().compareTo(s2.getName()):num;
                return num2;
            }
        });//此处采用匿名内部类完成。按照年龄从小到大排序，年龄相司时，按照姓名的字母顺序排序

        for(Student s :array){
            System.out.println(s.getName()+","+ s.getAge());
        }
    }
}
