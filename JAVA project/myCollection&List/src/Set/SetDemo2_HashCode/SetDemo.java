package Set.SetDemo2_HashCode;

public class SetDemo {
    public static void main(String[] args) {
        Student s1 = new Student("林青霞",30);

//        同一个对象多次调用hashCode()方法返圈的哈希值是相同的
        System.out.println(s1.hashCode());//1324119927
        System.out.println(s1.hashCode());//1324119927

//        默认情况下，不同对象的哈希值是不相同的
//        通过方法重写，可以实现不同对象的哈希值是相同的
        //注1：重写改变哈希值
        Student s2 = new Student("林青霞",30);
        System.out.println(s2.hashCode());//990368553

        System.out.println("--------");

        System.out.println("hello".hashCode());
        System.out.println("world".hashCode());
        System.out.println("java".hashCode());

        System.out.println("hello".hashCode());
        System.out.println("--------");

        System.out.println("重地".hashCode());//字符串的hashCode()是被重写过的
        System.out.println("通话".hashCode());//此处一样的哈希值是因为巧合，哈希碰撞了

    }
}
