package InterfacePrime.InterfaceDemo2;

public class InterfaceDemo {
    public static void main(String[] args) {
        Inter i =new InterImpl();

//        i.num = 20;//虽然接口中没有final但它仍然是final
        System.out.println(i.num);

//        i.num2=40;//num2为final无法修改
        System.out.println(i.num2);

        System.out.println(Inter.num);//此处说明可以通过Inter.num访问，因为他是静态常量
    }
}
//接口的成员特点
//    成员变量
//        只能是常量
//        默认修饰符： public static final
//    构造方法
//        接口没有构造方法，因为接口主要是对行为进行抽象的，是没有具体存在
//        一个类如果没有父类，默认继承自 Object类
//    成员方法
//        只能是抽象方法
//        默认修饰符： publicabstract
//        关于接口中的方法，JDK8和JDK9中有一些新特性，后面再讲解



