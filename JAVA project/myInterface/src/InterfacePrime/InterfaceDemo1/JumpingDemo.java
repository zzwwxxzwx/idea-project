package InterfacePrime.InterfaceDemo1;

public class JumpingDemo {
    public static void main(String[] args) {
//        Jumpping j =new Jumpping();//接口也是抽象的，没法直接实例化

        Jumpping j = new Cat();//所以需要进行类似多态的形式，用实现类对象的方式实例化
        j.jump();
    }
}
//接口的特点
//    接口用关键字 interfacef修饰
//        publicinterface接口名{}
//    类实现接口用 implements表示
//        publicclass类名 implements接口名{}
//    接口不能实例化
//        接口如何实例化呢？参照多态的方式，通过实现类对象实例化，这叫接口多态，
//        多态的形式：具体类多态，抽象类多态，接口多态
//        多态的前提：有继承或者实现关系；有方法重写；有父（类/接口）引用指向（子/实现）类对象
//    接口的实现类
//        要么重写接口中的所有抽象方法
//        要么是抽象类


