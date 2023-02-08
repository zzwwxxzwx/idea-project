package Set.SetDemo7_Comparable_3_8;


import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<Student>();

        Student s1 = new Student("xishi",29);
        Student s2 = new Student("wangzhaojun",28);
        Student s3 = new Student("diaochan",30);
        Student s4 = new Student("yangyuhuan",33);

        Student s5 = new Student("linqingxia",33);//注2：和yangyuhuan无法添加
        Student s6 = new Student("linqingxia",33);

        ts.add(s1);//ClassCastException： Student cannot be cast to class java.lang.Comparable
        //注1：需要让学生类实现Comparable这个接口，泛型为Student，重写compareTo().
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);

        ts.add(s5);//注2：年龄重复时候，需要比较姓名。
        ts.add(s6);//重复，故未添加

        for(Student s :ts){
            System.out.println(s.getName()+","+s.getAge());
        }
        
    }
}
