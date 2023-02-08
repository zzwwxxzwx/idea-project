package InnerClass5inDevelopment;

public class JumpingDemo {
    public static void main(String[] args) {
        JumppingOperator jo = new JumppingOperator();
//        Jumping j = new Cat();
//        jo.method(j);
//
//        Jumping j2 = new Dog();
//        jo.method(j2);
//        System.out.println("------");

        //注1:解决每使用一次就要创建一个新的类的问题,因此使用匿名内部类来实现
        jo.method(new Jumping() {
            @Override
            public void jump() {
                System.out.println("猫跳高");
            }
        });

        jo.method(new Jumping() {
            @Override
            public void jump() {
                System.out.println("狗跳高");
            }
        });

    }
}
