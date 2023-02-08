package args3Interface;

public class JumpingDemo {
    public static void main(String[] args) {
        JumpingOperator jo = new JumpingOperator();
        Jumping j = new Cat();
        jo.useJumpping(j);

        Jumping j2 = jo.getJummpping ();//new Cat()
        j2.jump();
    }
}
//接口名作为形参和返回值
//    方法的形参是接口名，其实需要的是该接口的实现类对象
//    方法的返回值是接口名，其实返回的是该接口的实现类对象
