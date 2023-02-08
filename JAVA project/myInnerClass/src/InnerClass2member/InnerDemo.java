package InnerClass2member;

public class InnerDemo {
    public static void main(String[] args) {
//        Inner i  = new Inner();//传统的访问方法无效

//      注1：该方法只用于public的内部类，private则不行
//        Outer.Inner oi = new Outer().new Inner();//创建对象方法
//        oi.show();

        Outer o = new Outer();
        o.method();//注2:该方法通过method,进入Outer中进行show方法
    }
}

//按照内部类在类中定义的位置不同，可以分为如下两种形式
//    在类的成员位五：成员内部类
//    在类的局部位置：局部内部类

