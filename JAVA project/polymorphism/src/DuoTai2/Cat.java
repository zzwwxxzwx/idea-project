package DuoTai2;

public class Cat extends Animal {
    public int age = 20;
    public int weight = 10;

    @Override
    public void eat() {
        System.out.println("猫吃鱼");//父类重写
    }

    public void playGame(){
        System.out.println("猫捉迷藏");
    }
}
