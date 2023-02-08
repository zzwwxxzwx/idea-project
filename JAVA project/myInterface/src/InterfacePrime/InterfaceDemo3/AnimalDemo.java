package InterfacePrime.InterfaceDemo3;

public class AnimalDemo {
    public static void main(String[] args) {
        Jumpping j = new Cat();
        j.jump();
        System.out.println();

        Animal a = new Cat();
        a.setName("加菲");
        a.setAge(5);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();
//        a.jump();//Animal没有jump方法
        System.out.println();

        a = new Cat("加菲2",45);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();
        System.out.println();

       //常用方法:即使用子类，因为他有最多的方法
       Cat c = new Cat();
       c.setName("加菲");
       c.setAge(5);
       System.out.println(a.getName() + "," + a.getAge());
       c.eat();
       c.jump();
    }
}
