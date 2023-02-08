package args2Abstract;

public class AnimalDemo {
    public static void main(String[] args) {
        AnimalOperator ao = new AnimalOperator();
        Animal a = new Cat();//注1：由于Animal是抽象方法不能实例化，所以通过多态创建子类对象传递到useAnimal()，
        ao.useAnimal(a);

        Animal a2 = ao.getAnimal();//new Cat()
        a2.eat();
    }
}
//抽象类名作为形参和返回值
//        方法的形参是抽象类名，其实需要的是该抽象类的子类对象
//        方法的返回值是抽象类名，其实返回的是该抽象类的子类对象
