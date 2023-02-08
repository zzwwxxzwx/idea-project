package DuoTai5_Transformation;


public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = new Cat();//向上转型
        a.eat();

        //向下转型
        Cat c = (Cat) a;
        c.eat();
        c.playGame();

//        向上转型
        a=new Dog();
        a.eat();

        //向下转型
        //ClassCastException类型转换异常
//        Cat cc = (Cat)a;//此处a已经是Dog，所以转型失败
//        cc.eat();
//        cc.playGame();

    }
}
