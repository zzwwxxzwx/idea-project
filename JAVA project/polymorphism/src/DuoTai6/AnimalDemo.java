package DuoTai6;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.setName("加菲猫");
        a.setAge(5);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();

        a = new Cat("加菲",5);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();

        System.out.println();

        Animal d = new Dog();
        d.setName("汪汪");
        d.setAge(15);
        System.out.println(d.getName()+","+d.getAge());
        d.eat();

        d = new Dog("汪汪",15);
        System.out.println(d.getName()+","+d.getAge());
        d.eat();

    }
}
