package ArrayList.StudentManager;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    /*
    1:用输出语句完成主界面的绵写
    2:用 Scanner实现键盘录入数据
    3:用 switchi语句完成操作的选择
    4:用循环完成再次回到主界面
    */

    public static void main(String[] args) {

        System.out.println("欢迎来到管理系统");
        ArrayList<Student> array = new ArrayList<>();
        while (true) {
            System.out.println();
            System.out.println("1、添加学生");
            System.out.println("2、删除学生");
            System.out.println("3、修改学生");
            System.out.println("4、查看所有学生");
            System.out.println("5、退出");
            System.out.println("请输入选择");

            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();

            switch (line) {
                case "1":
                    addStudent(array);
                    break;
                case "2":
                    deleteStudent(array);
                    break;
                case "3":
                    updateStudent(array);
                    break;
                case "4":
                    findAllStudent(array);
                    break;
                case "5":
                    System.out.println("谢谢使用");
                    System.exit(0);//虚拟机关闭，故退出系统
            }
        }


    }

    public static void addStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入姓名");
        String name = sc.nextLine();
        System.out.println("请输入年龄");
        String age = sc.nextLine();
        System.out.println("请输入学号");
        String sid = sc.nextLine();
        while (isUsed(array,sid)){
            System.out.println("该学号重复请重新输入，若要取消输入-1");
            sid =sc.nextLine();
            if (sid.equals("-1")){
                System.out.println("已取消添加");
                return;
            }
        }
        System.out.println("请输入地址");
        String address = sc.nextLine();

        array.add(new Student(name, age, sid, address));
        System.out.println("已添加学生:" + array.get(array.size() - 1).getName());

    }

    public static boolean isUsed(ArrayList<Student>array,String sid){
        boolean flag = false;
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getSid().equals(sid)) {
                flag=true;
                break;
            }
        }
        return flag;
    }

    public static void deleteStudent(ArrayList<Student> array) {
        System.out.println("请输入需要删除的学生学号");
        Scanner sc = new Scanner(System.in);
        String sid=sc.nextLine();

        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getSid().equals(sid)) {
                array.remove(i);
                System.out.println("已删除学生"+sid);
                return;
            }
        }
        System.out.println("无"+sid+"的学生信息");

    }

    public static void updateStudent(ArrayList<Student> array){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要修改的学生的学号");
        String sid = sc.nextLine();

        for (int i = 0; i < array.size(); i++) {
            Student student=array.get(i);
            if (sid.equals(student.getSid())){
                System.out.println("请输入需要修改的姓名");
                String name = sc.nextLine();
                System.out.println("请输入需要修改的年龄");
                String age = sc.nextLine();
                System.out.println("请输入需要修改的居住地");
                String address = sc.nextLine();
                Student s = new Student(name,age,sid,address);
                array.set(i,s);
                System.out.println("修改成功");
                return;
            }
        }
        System.out.println("修改失败，"+sid+"信息不存在");
    }

    public static void findAllStudent(ArrayList<Student> array) {
        if (array.size() == 0) {
            System.out.println("无信息，请先添加");
            return;//此处return用于判断为无数据后直接返回，不再执行后面的语句
        }
        System.out.println("学生有以下这些");
        System.out.println("姓名\t年龄\t学号\t居住地");
        for (int i = 0; i < array.size(); i++) {
            Student stu = array.get(i);
            System.out.println(stu.getName() + "\t" + stu.getAge() + "\t" + stu.getSid() + "\t" + stu.getAddress());
        }
    }
}
