package Set.SetDemo7_Comparable_3_8;

public class Student implements Comparable<Student> {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

//    注1：重写compareTo
    @Override
    public int compareTo(Student s) {
//        return 0;//0意味着重复元素不添加
//        return 1;//正数意味着升序
//        return -1;//负数为降序
        //按照年龄从大到小排序
        int num = this.age - s.age;//升序this放在前
//        int num = this.age - s.age;//降序this放在后

        int num2 = num == 0 ? this.name.compareTo(s.name) : num;//注2：年龄重复时候，需要比较姓名。
        return num2;
    }
}
