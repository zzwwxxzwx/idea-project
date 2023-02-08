package DuoTai2;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = new Cat();

        System.out.println(a.age);
        //System.out.println(a.weight);//无法运行

        a.eat();
        //a.playGame();//无法运行

        //多态访问成员方法和变量：
        //成员变量编译看左边，运行结果为左边
        //成员方法编译看左边，运行结果为右边
        //原因：方法可以重写，但变量没有
    }
}
