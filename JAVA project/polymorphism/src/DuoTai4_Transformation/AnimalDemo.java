package DuoTai4_Transformation;



public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = new Cat();//向上转型
        a.eat();
//        a.playGame();

//        Cat c = new Cat();
//        c.eat();
//        c.playGame();//这种直接创建可以调用playGame，但是繁琐

        //向下转型：解决不能访问子类特有功能的缺陷
        Cat c = (Cat)a;
        c.eat();
        c.playGame();

    }
}
