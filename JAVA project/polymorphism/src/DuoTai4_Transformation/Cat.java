package DuoTai4_Transformation;

public class Cat extends Animal {

    @Override
    public void eat() {
        System.out.println("猫吃鱼");//父类重写
    }

    public void playGame(){
        System.out.println("猫捉迷藏");
    }


}
