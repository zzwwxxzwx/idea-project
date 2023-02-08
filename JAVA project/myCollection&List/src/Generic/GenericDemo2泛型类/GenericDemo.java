package Generic.GenericDemo2泛型类;

public class GenericDemo {
    public static void main(String[] args) {
        Student s  =new Student();
        s.setName("林青霞");
        System.out.println(s.getName());

        Teacher t = new Teacher();
        t.setAge(30);
//        t.setAge("30");//为了一个方法可以接收各种不同的类型，因此使用泛型
        System.out.println(t.getAge());
        System.out.println("--------");

        Generic<String> g1 = new Generic<String >();
        g1.setT("林青霞");
        System.out.println(g1.getT());

        Generic<Integer> g2 = new Generic<Integer>();
        g2.setT(30);
        System.out.println(g2.getT());

        Generic<Boolean> g3 = new Generic<Boolean>();
        g3.setT(true);
        System.out.println(g3.getT());
    }
}
