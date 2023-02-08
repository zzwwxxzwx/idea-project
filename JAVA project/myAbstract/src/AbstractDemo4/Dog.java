package AbstractDemo4;

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }
}
