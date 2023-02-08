package AbstractDemo2;

public class AnimalDemo {
    public static void main(String[] args) {
//        Animal a =new Animal();//不能直接定义具体的对象
        Animal a = new Cat();
        a.eat();
        a.sleep();
    }
}
//抽象类的特点
//        抽象类和抽象方法必须使用 abstract关键字修饰
//          public abstract class类名{}
//          public abstract void eat();
//        抽象类中不一定有抽象方法，有抽象方法的类一定要是抽象类
//        抽象类不能实例化
//          抽象类如何实例化呢？参照多态的方式，通过子类对象实例化，这叫抽象类多态
//        抽象类的子类
//          要么重写抽象类中的所有抽象方法
//          要么是抽象类
