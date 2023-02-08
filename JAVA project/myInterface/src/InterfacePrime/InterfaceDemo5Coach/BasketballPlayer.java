package InterfacePrime.InterfaceDemo5Coach;

public class BasketballPlayer extends Player{
    @Override
    public void study() {
        System.out.println("篮球运动员学篮球");
    }

    @Override
    public void eat() {
        System.out.println("篮球运动员吃B套餐");
    }

    public BasketballPlayer() {
    }

    public BasketballPlayer(String name, int age) {
        super(name, age);
    }
}
