package AbstractDemo4;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.setName("加菲");
        a.setAge(11);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();
        System.out.println("----------");

        a=new Cat("加菲",15);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();
    }

}
