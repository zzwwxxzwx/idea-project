package DuoTai3;

public class AnimalOperator {
    /*
    public void useAnimal(Cat c){
        c.eat();
    }

    public void useAnimal(Dog d){
        d.eat();
    }
    */

    public void useAnimal(Animal a){
//        Animal a =new Cat();
//        Animal a =new Dog();

        a.eat();//该过程代替了上面具体的步骤
        //a.lookDoor();//报错：多态只能访问父类内容，不能访问具体子类内容


    }
}
