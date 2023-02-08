package ArrayList.StudentList;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentList {
    public static void main(String[] args) {
        ArrayList<Student> stu = new ArrayList<>();

        Scanner in =new Scanner(System.in);
        System.out.println("输入学生个数");
        int num = in.nextInt();



        for (int i = 0; i < num; i++) {
            addStudent(stu);
        }
        for (int i = 0; i < stu.size(); i++) {
            Student s = stu.get(i);
            System.out.println(s.getName()+","+s.getAge());
        }

    }


    public static void addStudent(ArrayList<Student> array){
        Scanner in =new Scanner(System.in);
        System.out.println("输入姓名");
        String name = in.nextLine();

        System.out.println("输入年龄");
        int age = Integer.parseInt(in.nextLine());
        Student s = new Student(age,name);
        s.setAge(age);
        s.setName(name);
        array.add(s);
    }
}
